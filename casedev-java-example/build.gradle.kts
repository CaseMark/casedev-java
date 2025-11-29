plugins {
    id("casedev.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":casedev-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :casedev-java-example:run` to run `Main`
    // Use `./gradlew :casedev-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "dev.casedev.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
