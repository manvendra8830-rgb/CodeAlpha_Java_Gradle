
# CodeAlpha Java Application using Gradle

## Project Overview

This project demonstrates Java application development
using Gradle build automation.

It includes dependency management, automated unit testing,
and Jenkins CI/CD integration.

## Technologies Used

- Java 21
- Gradle 9.9
- JUnit Jupiter 6.0.1
- Jenkins
- Git and GitHub

## Features

- Java application development
- Gradle build automation
- Dependency management using Gradle
- Automated unit testing
- Jenkins CI/CD pipeline
- JAR packaging

## Project Structure

```text
CodeAlpha_Java_Gradle/
├── app/
│   ├── src/main/java/org/example/App.java
│   ├── src/test/java/org/example/AppTest.java
│   └── build.gradle
├── gradle/wrapper/
├── Jenkinsfile
├── README.md
├── settings.gradle
└── gradlew
```

## Execute Application

```bash
./gradlew :app:run
```

## Run Tests

```bash
./gradlew test
```

## Build Project

```bash
./gradlew clean build
```

## Generate JAR

```bash
./gradlew :app:jar
```

JAR Location:

app/build/libs/

## Jenkins Integration

Connect the GitHub repository to a Jenkins Pipeline job.

Use Pipeline script from SCM and select the Jenkinsfile
from the repository root.

## Internship

CodeAlpha DevOps Internship
Task 3: Java Application using Gradle
