version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

plugins {
    java

    id("io.franzbecker.gradle-lombok") version "3.0.0"
}

dependencies {
    compile("org.jetbrains:annotations:16.0.2")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}