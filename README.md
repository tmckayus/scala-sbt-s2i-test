# scala-sbt-s2i-test

This application is an implementation of the SparkPi example based on the
upstream Apache Spark project, it is designed for use with a source-to-image
workflow using [OpenShift](https://www.openshift.org) and the
[radanalytics project](https://radanalytics.io) tooling.

## quick start

1. Install the [radanalytics bits](https://radanalytics.io/get-started)
1. Run the following command to launch the application:
   ```bash
   oc new-app --template oshinko-scala-spark-build-dc \
       -p APPLICATION_NAME=scala-sparkpi \
       -p GIT_URI=https://github.com/pdmack/scala-sbt-s2i-test \
       -p APP_MAIN_CLASS=org.apache.spark.examples.SparkPi
   ```
1. Follow the logs of your application and look for the Pi results:
   ```bash
   oc logs -f dc/scala-sparkpi
   ```
