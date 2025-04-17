plugins {
    application
    kotlin("jvm") version "2.1.20"
}

group = "com.example"
version = "1.0-SNAPSHOT"


application {
    mainClass = "com.example.MainKt"
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(testFixtures(project(":has-test-fixture"))) // We are using testFixtures in the main classpath
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
