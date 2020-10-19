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
    //反射
    implementation("org.jetbrains.kotlin","kotlin-reflect","1.4.10")
    //协程
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.0-M1")
    testImplementation("junit", "junit", "4.12")
}
