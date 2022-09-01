name := """football-project"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies ++= List(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
  "com.typesafe.slick" %% "slick" % "3.3.2"
)
