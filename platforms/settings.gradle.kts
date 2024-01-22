dependencyResolutionManagement {
    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }
}

rootProject.name = "platforms"

include("application-platform")
include("plugins-platform")
include("data-platform")
include("test-platform")