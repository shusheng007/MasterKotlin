plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "top.ss007"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin","kotlin-reflect","1.4.10")
    testImplementation("junit", "junit", "4.12")
}
