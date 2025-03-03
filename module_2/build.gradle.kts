plugins {
    id("java")
    id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:32.0.0-jre")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application{

}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}

tasks.test {
    useJUnitPlatform()
}