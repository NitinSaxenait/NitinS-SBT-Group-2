name := "NitinS-SBT-Group-2"
version := "0.1"
scalaVersion := "2.12.12"
sbtPlugin := true

lazy val common = project.in(file("common"))
.settings(
    
libraryDependencies ++= Seq( "io.github.embeddedkafka" %% "embedded-kafka" % "2.4.0" ,
 "org.json4s" %% "json4s-native" % "3.7.0-M7",
 "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
 "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
 "org.mockito" %% "mockito-scala" % "1.16.13" % "test",
))



lazy val actor = project.in(file("actor"))
.settings(

libraryDependencies ++= Seq( "com.typesafe.akka" %% "akka-actor-typed" % "2.6.10",
                             "com.typesafe.akka" %% "akka-stream" % "2.6.10",
 "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.10",
 "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.10" % "test",
 "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
 )).dependsOn(common)


 
lazy val root = project.in(file(".")).aggregate(common,actor)