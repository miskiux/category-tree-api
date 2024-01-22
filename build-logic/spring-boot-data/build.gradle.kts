plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(project(":commons"))
    implementation(libs.spring.boot.gradle.plugin)
    implementation(platform("com.category.tree.platform:plugins-platform"))
    implementation(platform("com.category.tree.platform:data-platform"))
    implementation(platform("com.category.tree.platform:test-platform"))
}
