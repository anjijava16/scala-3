organization := "com.typesafe.training"

name := "scala-train"

version := "3.0.0"

scalaVersion := Version.scala

libraryDependencies ++= Dependencies.scalaTrain

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.4" % "test"
)

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

initialCommands in console := "import com.typesafe.training.scalatrain._"

//initialCommands in (Test, console) := (initialCommands in console).value + ",TestData._"
