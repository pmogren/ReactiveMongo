scalaVersion := "2.10.0"

// scalacOptions ++= Seq("-Xlog-implicits")

scalacOptions in (Compile, doc) ++= Opts.doc.title("ReactiveMongo API")

// Adding .0 (followed by anything) makes our version appear later than the one it is based on.
// Also change this in ReactiveMongo.scala
scalacOptions in (Compile, doc) ++= Opts.doc.version("0.9.0-commercehub-1")
