plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

val quarkusPlatformVersion: String by project

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("io.quarkus:gradle-application-plugin:$quarkusPlatformVersion")
//    implementation("org.kordamp.gradle:jandex-gradle-plugin:$jandexPluginVersion")




}