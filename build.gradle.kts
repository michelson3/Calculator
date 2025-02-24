plugins {
    kotlin("jvm") version "2.1.10"
}

group = "com.jackal.calculator"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/") }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}