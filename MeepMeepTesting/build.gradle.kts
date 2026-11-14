import org.gradle.kotlin.dsl.implementation
import java.net.URI

plugins {
    id("java-library")
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
repositories {
    maven { url = URI("https://jitpack.io") }
    maven { url = URI("https://maven.brott.dev/") }
}

dependencies {
    implementation("com.github.rh-robotics:MeepMeep:v1.1.0")
}