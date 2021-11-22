name         := "scala-sbt"
version      := "1.0.0-SNAPSHOT"
scalaVersion := "2.12.8"

mainClass in (Compile, assembly) := Some("com.baeldung.scala.sbt.SbtAssemblyExample")
assemblyJarName in assembly      := "sbt-assembly-example-1.0.0.jar"

val sparkVer = "2.4.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql"  % sparkVer,
  "org.apache.spark" %% "spark-core" % sparkVer % "provided",
)

// META-INF discarding
assemblyMergeStrategy in assembly := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}


