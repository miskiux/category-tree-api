plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.spring.boot.gradle.plugin)
    implementation(platform("com.category.tree.platform:plugins-platform"))
    implementation(project(":commons"))
    implementation(platform("com.category.tree.platform:application-platform"))
}
