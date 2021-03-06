version := "0.1"
scalaVersion := "2.12.6"

libraryDependencies += "io.circe" %% "circe-core" % "0.9.1"

inConfig(Compile)(Seq(
  sourceGenerators += apiBuilderSourceUpdate,
  resourceGenerators += apiBuilderResourceUpdate
))

inConfig(Test)(Seq(
  sourceGenerators += apiBuilderSourceUpdate,
  resourceGenerators += apiBuilderResourceUpdate
))
