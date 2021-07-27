# WexChallenge
I used the BRQ framework to help me with some iterations.
Libraries used:

[![Appium](https://img.shields.io/badge/appium-v.%207.0.0-blueviolet.svg)](http://appium.io/)  [![junit](https://img.shields.io/badge/junit-4.12-red.svg)](https://junit.org/junit4/) [![gherkin](https://img.shields.io/badge/gherkin-2.12.2-brightgreen.svg)](https://cucumber.io/docs/gherkin/) [![restassured](https://img.shields.io/badge/restassured-2.9.0-brightgreen.svg)](https://github.com/rest-assured/rest-assured/wiki/ReleaseNotes29) [![selenium](https://img.shields.io/badge/selenium-3.141.59-blue.svg)](https://www.seleniumhq.org/)

Steps to run this code:
1- With GitHub installed in your computer clone this repository using git clone https://github.com/karinafarias/WexChallenge.git
2- After you cloned this repository, you can just import this projet at Eclipse

Code framework:
-src/main/java - in this path we have the BRQ framework
-src/test/java - in this path we have the packages to run the code
  
 src
  |-- test
       |-- java 
            |--APIConnection
            |--elementos
            |--executar
                  |--CucumberExecuteTest.java - in this class you can change the tags and execute especific scenaries. Just run with JUnit
            |--paginas
            |--steps
            |--utils
            
The features are in src/test/resources/features.
