plugins {
    java
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

repositories {
    mavenCentral()
}


val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("io.quarkus:quarkus-smallrye-openapi")
    implementation("io.quarkus:quarkus-hibernate-orm-panache")
    implementation("io.quarkus:quarkus-jdbc-postgresql")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-hibernate-orm")
    implementation("io.quarkus:quarkus-hibernate-orm-panache:3.7.0")
    implementation("io.quarkiverse.jpastreamer:quarkus-jpastreamer:3.0.3.Final")
    implementation("io.quarkus:quarkus-universe-bom:3.6.8")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
    annotationProcessor("com.speedment.jpastreamer:fieldgenerator-standard:3.0.4")
    implementation("com.speedment.jpastreamer:jpastreamer-core:3.0.4")
    compileOnly("org.projectlombok:lombok:1.18.30")
    implementation("javax.persistence:javax.persistence-api:2.2")

}

group = "com.example"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


sourceSets {
    main {
        java {
            srcDir("src/main/java")
            srcDir("target/generated-sources/annotations")
        }
    }
}


tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
