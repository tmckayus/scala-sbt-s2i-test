# scala-sbt-s2i-test

This application is a baseline measure of Spark overhead within a driver pod, 
it is designed for use with a source-to-image workflow using 
[OpenShift](https://www.openshift.org) and the
[radanalytics project](https://radanalytics.io) tooling.

## quick start

1. Install the [radanalytics bits](https://radanalytics.io/get-started)
1. Run the following command to launch the application:
   ```bash
   oc new-app --template oshinko-scala-spark-build-dc \
       -p APPLICATION_NAME=scala-sparksleep \
       -p GIT_URI=https://github.com/pdmack/scala-sbt-s2i-test \
       -p GIT_REF=sleeper
       -p APP_MAIN_CLASS=org.apache.spark.examples.SparkSleep
   ```
1. Follow the logs of your application and look for the Pi results:
   ```bash
   oc logs -f dc/scala-sparksleep
   ```
