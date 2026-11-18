plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.smartgate360.guard"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.smartgate360.guard"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0-demo"
    }
}
