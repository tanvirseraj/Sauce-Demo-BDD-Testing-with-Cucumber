# Cucumber
Cucumber is a testing framework that uses Behavior-Driven Development (BDD) to support collaboration, discovery, and examples. BDD is a way for software teams to work that closes the gap between technical and business people by reducing communication. Cucumber's BDD approach allows developers and customers to specify behaviors to test, such as incorrect or correct logins.

# Login Automation with Cucumber Selenium

## Components of Cucumber BDD Framework
Cucumber is a tool for running automated acceptance tests 
written in a behavior driven development style. 
One of its wonderful main features is the ability to execute 
plain text functional description (written in language named Gherkin) 
as automated tests.
Feature Files,
Cukes Runner,
Step Definition,
Pages
1.Feature files 
Consists of scenarios that test a certain feature or functionality 
Feature is main story while scenarios are the test cases to the story(feature) 
2.Cukes Runner 
A class that strictly runs the tests, generates codes for step definition 
@smoketest 
3. Step definition 
A class that made of steps that starts withGherkin language 
Make sure the step definition is in the same package as cukes Runner, 
or child package (not parent or sibling)
4.Pages 
I have a Pages package where I identify and store web elements variables
and methods for each page of my application.
I also use PageFactory pattern to instantiate 
my web elements by using @FindBy

## Technology and Tools used:
- Selenium
- Cucumber
- Java
- JUnit
- TestNG
- Maven
- Spring Tools 4 IDE
- Extent Report
- Browser - Google Chrome

## Functionality
-E2E Gherkin based scenario of Sauce Demo Login Page 

## Scenario:
- Visit this site : https://www.saucedemo.com/
- Login with Invalid Credentials
- Login with Valid Credentials

## Prerequisite:
- Java 8 or latest version
- Spring Tool 4 IDE or any java IDE
- Configure JAVA_HOME and MAVEN_HOME

## How to run this project:
- Clone this project
- hit the following command: mvn clean test / mvn clean instal
