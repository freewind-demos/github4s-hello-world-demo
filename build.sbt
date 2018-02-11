name := "Scala Hello World Demo"

version := "0.1"

organization := "org.my"

scalaVersion := "2.12.4"

sbtVersion := "1.0.4"

libraryDependencies ++= Seq(
  "com.47deg" %% "github4s" % "0.18.0",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)