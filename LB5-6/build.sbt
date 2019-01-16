name := "Hello Test #1"

version := "1.0"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.0"
)

fork in run := true