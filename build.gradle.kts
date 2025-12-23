plugins {
    id("org.jetbrains.intellij") version "1.17.2"
    java
    kotlin("jvm") version "1.9.23"
}

group = "io.github.ivanlutsenko"
version = "5.7.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

intellij {
    version.set("IC-2023.3.5")
    type.set("IC")
}

tasks {
    patchPluginXml {
        sinceBuild.set("231")
        untilBuild.set("")
    }

    publishPlugin {
        val tokenValue = project.findProperty("jetbrainsToken") as String? ?: System.getenv("JETBRAINS_TOKEN")
        if (tokenValue != null) {
            token.set(tokenValue)
        }
        channels.set(listOf("stable"))
    }

    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }
}