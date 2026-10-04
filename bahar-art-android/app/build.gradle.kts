plugins {
    id("com.android.application")
}

android {
    namespace = "com.baharloo.art.release"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.baharloo.art.release"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.2.1"
    }
}
