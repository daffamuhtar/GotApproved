plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.daffamuhtar.gotapproved.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.daffamuhtar.gotapproved.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    val koinComposeVersion = "3.4.1"
    val coilVersion = "2.2.2"
    val accompanistVersion = "0.28.0"
    val navVersion = "2.5.3"

    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.3.3")
    implementation("androidx.compose.ui:ui-tooling:1.3.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.3")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.activity:activity-compose:1.6.1")

    implementation("io.insert-koin:koin-androidx-compose:$koinComposeVersion")
    implementation("io.coil-kt:coil-compose:$coilVersion")
    implementation("com.google.accompanist:accompanist-systemuicontroller:$accompanistVersion")
    implementation("androidx.navigation:navigation-compose:$navVersion")

    implementation("androidx.compose.material3:material3:1.1.1")
    implementation("androidx.compose.material3:material3-window-size-class:1.1.1")

//    val composeBom = platform(libs.androidx.compose.bom)
//    implementation(composeBom)
//    androidTestImplementation(composeBom)
//
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.kotlin.stdlib)
//    implementation(libs.kotlinx.coroutines.android)
//
//    implementation(libs.androidx.compose.ui.tooling.preview)
//    debugImplementation(libs.androidx.compose.ui.tooling)
//
    implementation(libs.androidx.compose.material3)
    implementation("com.google.accompanist:accompanist-adaptive:0.26.2-beta")

    implementation(libs.androidx.compose.materialWindow)
    implementation(libs.androidx.compose.material.iconsExtended)
//
//    implementation(libs.androidx.lifecycle.runtime)
//    implementation(libs.androidx.lifecycle.viewModelCompose)
//    implementation(libs.androidx.lifecycle.runtime.compose)
//    implementation(libs.androidx.navigation.compose)
//
//    implementation(libs.androidx.activity.compose)
//    implementation(libs.androidx.window)
//
//    androidTestImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.test.core)
//    androidTestImplementation(libs.androidx.test.runner)
//    androidTestImplementation(libs.androidx.test.espresso.core)
//    androidTestImplementation(libs.androidx.test.rules)
//    androidTestImplementation(libs.androidx.test.ext.junit)
//    androidTestImplementation(libs.kotlinx.coroutines.test)
//    androidTestImplementation(libs.androidx.compose.ui.test)
//    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
//
//    debugImplementation(libs.androidx.compose.ui.test.manifest)

}