### Serenity BDD- ScreenPlay Pattern Demo

## Prerequisite details

### JDK
You will need a version of the Java JDK (8 or higher). The demo will be done using OpenJDK 11.

### IntelliJ

 Java IDE - recommend IntelliJ - you can download the Community edition from here: https://www.jetbrains.com/idea/download. 

For IntelliJ,
 * Download the following plugins: `Cucumber for Java :`  [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java), `Gherkin`, `Lombok`
 * After downloading Lombok you will need to enable `annotation processing` - search for it in settings
 * Restart your IDE and wait for it to finish indexingplugin is installed and enabled.

### Chrome
We will be running tests in Chrome, so make sure you have the latest version of Chrome installed (Version 74.0.3729.169 or higher)

### Gradle
The project will run with Gradle. You can use the Gradle Wrapper to make sure you are using the right version of Gradle. See the below version requirements.

#### Version Required

| serenity-core | serenity-gradle-plugin | serenity-cucumber5 | Cucumber            |
|---------------|-----------------------|--------------------|---------------------|
| 2.2.0         | 2.2.0                 |  2.2.0             | 5.5.0               |


## Getting started
Clone or download the starter project from https://github.com/MythiliMuthukumar/SerenityScreenPlay

```
git clone https://github.com/MythiliMuthukumar/SerenityScreenPlay
```

Run the initial tests to make sure everything works:


```
./gradlew clean test
```
 ## Test Config
 * Before running any tests you must tell the system where your environment is
 * open `serenity.conf`
 * Set `webdriver.base.url` to be the base url of your environment e.g. `https://www.google.com
 * Set headless.mode = false .If you want to see what's going on in browser

## Executing the tests
To run the project, you can just run the `CucumberTestSuite` test runner class from IDE or 

run `gradle test` from the command line or

From IDE -->right click the specific feature file --> Click -->Run the feature file

## Configuring IntelliJ Runner / Debugger
* Ensure you have `Cucumber for Java` installed
* Open `Run/Debug Configurations`
* Expand `Templates`
* Click `Cucumber for Java`
* Set `Main class` to be `net.serenitybdd.cucumber.cli.Main`
* Set `Glue` to be `demo`
* You should now be able to run or debug any Feature / Scenario by right clicking the description 
and selecting run/debug from the context menu

## Reporting

The Serenity reports will be generated in the `target/site/serenity` directory.

Open -->index.html --> In any browsers

## Starting a local Selenium grid (for parallel UI tests)
TODO