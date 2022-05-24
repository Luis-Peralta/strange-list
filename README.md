### README PLEASE
# Serenity Strange list - project - testing QA
##Hi there! 😄

Link to see the tracking step by step of exercise.
https://dashboard-example.notion.site/Exercise-Stranger-List-d6246446102f4a10b1a8c57411d1bed5

This is a framework which contains test cases for testing website 'Strange List'.
In this project I used serenity bdd with selenium, cucumber, junit.

## Get the code

Git:
    git clone https://github.com/Luis-Peralta/strange-list.git

Or simply [download a zip](https://github.com/Luis-Peralta/strange-list.git) file.

## Use Maven
Open a command window and run:

    mvn clean verify

## Viewing the reports

The command provided above will produce a Serenity test report in the `target/site/serenity` directory. ¡Go take a look!.

#Understanding the project...🤓
## 🗂 Folder Testing QA
- In this folder you can see the all documentation about manual testing like test plan, test cases and evidence with each test executed and if these pass or not.

## 🗂 Folder and package test / java / com.strangelist
### runner
- to run test cases
### steps
- actions by actor
### stepsdefinitions
- steps by actor and connecting directly with the file .feature
### tasks
- methods to do some actions with the elements of the website.
### userinterface
- elements of the website with its locators.

## 🗂 Folder resources
### features - Test suite
- In the folder features you can search the test suite where are the 5 test-cases written in gherkin language.
### images
- Images to upload on the website.
### webdriver
- Don't necessary 
### serenity.config
- file to set some options like chrome, environments, etc

## 🗂 Folder target
- This folder is generated when we run the command 'mvn clean verify' and it generates reports in html format and saves these files in this folder

## 🗂 Dockerfile and docker-compose 
with command to create an image of docker:

    docker build -t strange:1.0 .
to up network and run docker-compose:

    docker-compose up

--------------
## 📑 command to run correctly test cases
### to run simple test cases in a local way and default (Desktop version).
    mvn clean verify
### to run test cases in mobile form (w:414px - h:736px) - and you can change these values in serenity.config
    mvn clean verify "-Denvironment=mobile"
### If you can run test cases in selenium-grid and set remote url
    mvn clean verify "-Dwebdriver.remote.url=http://localhost:4444/wd/hub"
### If you can run particular test-cases with tags
    mvn clean verify "-Dcucumber.filter.tags= @TC-02"

