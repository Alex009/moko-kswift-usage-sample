buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()

        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-dependencies")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
        classpath("com.android.tools.build:gradle:7.4.2")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}