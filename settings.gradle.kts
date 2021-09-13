/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/7.1.1/userguide/multi_project_builds.html
 */

rootProject.name = "gradle-otel-tracing"
include("otel-gradle-tracing")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url="https://jitpack.io")
    }
    plugins {
        id("com.github.jkwatson.gradle-otel-tracing") version "0.0.2"
    }
}
