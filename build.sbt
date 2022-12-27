name := """football-project"""
organization := "com.example"

version := "1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

assembly / assemblyJarName := s"${name.value}.jar"

assembly / mainClass := Some("play.core.server.ProdServerStart")
assembly / fullClasspath += Attributed.blank(PlayKeys.playPackageAssets.value)

mainClass in Compile := Some("play.core.server.ProdServerStart")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _                        => MergeStrategy.first
}

scalaVersion := "2.13.6"

libraryDependencies ++= List(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
  "com.typesafe.slick" %% "slick" % "3.3.2"
)

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)
