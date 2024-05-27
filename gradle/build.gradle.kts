plugins {
    java
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.18.0"))

    testImplementation("io.cucumber:cucumber-java:7.8.1")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.8.1")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
    // Work around. Gradle does not include enough information to disambiguate
    // between different examples and scenarios.
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
