import com.typesafe.sbt.SbtNativePackager._
import com.typesafe.sbt.packager.Keys._

packagerSettings

name := "dataApi"



version := "0.0.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.27"
)

play.Project.playScalaSettings

description in Linux := "The description"

packageDescription in Linux := "The description"

packageSummary := "A package summary"

maintainer := "saba.el-hilo@hootsuite.com"
