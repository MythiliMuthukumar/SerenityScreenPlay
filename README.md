### Serenity BDD- ScreenPlay Demo

## Prerequisite overview

* [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads) or higher
* [IntelliJ Community Edition](https://www.jetbrains.com/idea/)
* [Google Chrome](https://www.google.com/chrome/)

## Prerequisite details

### Gradle
The project will run with Gradle. You can use the Gradle Wrapper to make sure you are using the right version of Gradle. See the below version requirements.

#### Version Required

| serenity-core | serenity-gradle-plugin | serenity-cucumber5 | Cucumber            |
|---------------|-----------------------|--------------------|---------------------|
| 2.2.0         | 2.2.0                 |  2.2.0             | 5.5.0               |

### JDK
You will need a version of the Java JDK (8 or higher). The demo will be done using OpenJDK 11.

### IntelliJ

 Java IDE - recommend IntelliJ - you can download the Community edition from here: https://www.jetbrains.com/idea/download. 

For IntelliJ, make sure the [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) plugin is installed and enabled.

### Chrome
We will be running tests in Chrome, so make sure you have the latest version of Chrome installed (Version 74.0.3729.169 or higher)

## Getting started
Clone or download the starter project from https://github.com/MythiliMuthukumar/SerenityScreenPlay

```
git clone https://github.com/MythiliMuthukumar/SerenityScreenPlay
```

Run the initial tests to make sure everything works:


```
./gradlew clean test
```
 

## Executing the tests
To run the project, you can just run the `CucumberTestSuite` test runner class from IDE or 

run `gradle test` from the command line or

right click the specific feature file --> Click -->Run the feature file

## Reporting

The Serenity reports will be generated in the `target/site/serenity` directory.

Open -->index.html --> In any browsers