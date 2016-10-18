val zipJS = taskKey[File]("build zip file containing all generated JS and exporter")

zipJS in Compile <<= (fastOptJS in Compile, packageJSDependencies in Compile, target) map {
  (jsFile, depsFile, tf) =>

    val zipFile = tf / "alexa-scalajs-lambda-test.zip"
    val inputs: Seq[(File, String)] = Seq((depsFile, "index.js")) ++ (Seq(jsFile.data) x Path.flat)

    IO.zip(inputs, zipFile)

    zipFile
}

organization := "com.gu"
description := "Testing whether it's possible to invoke a Lambda written in ScalaJS from Alexa - Amazon's echo device."
name := "alexa-scalajs-lambda-test"
scalaVersion := "2.11.8"
scalaJSUseRhino in Global := false
scalaJSStage in Global := FastOptStage
skip in packageJSDependencies := false
jsDependencies += ProvidedJS / "lambda-exports.js"


enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq()