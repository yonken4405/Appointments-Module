
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        // ... Your existing repositories here (like google(), mavenCentral(), etc.)
    }
    dependencies {
        // ... Your existing dependencies here
        classpath ("com.google.gms:google-services:4.3.15") // Add this line
    }
}


plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}