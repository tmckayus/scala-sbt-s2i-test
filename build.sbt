scalaHome := Some(file("/opt/scala"))
scalaVersion := "2.11.8"

name := "SparkPi"

version := "0.1"

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0" % "provided"
//libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.0.0-beta1"
