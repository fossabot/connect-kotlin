plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.connectrpc.examples.android"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    namespace = "com.connectrpc.examples.android"

    packaging {
        resources {
            excludes.add("/META-INF/*")
        }
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintLayout)
    implementation(libs.androidx.recyclerview)
    implementation(libs.android.multidex)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.android.material)
    implementation("build.buf:protovalidate:0.2.1")

    implementation(project(":okhttp"))
    implementation(project(":examples:generated-google-java"))
    implementation(libs.okhttp.core)
}
