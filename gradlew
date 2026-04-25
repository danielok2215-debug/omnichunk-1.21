#!/bin/sh
exec java -Dorg.gradle.appname=gradlew "-Dorg.gradle.wrapper.gradleDistributionUrl=https://services.gradle.org/distributions/gradle-8.10-bin.zip" -jar "$(dirname "$0")/gradle/wrapper/gradle-wrapper.jar" "$@"
