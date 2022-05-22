@test-suite-desktop
Feature: As a user I want to validate the main functionalities of the website.

  #pre-condition
  Background:
    Given As a user I want to open the browser and go to the main page

  ###TEST-CASES
  @TC-01
  Scenario Outline: Create an item
    Given <User> clicking on the choose file button
    Examples:
      | User |
      | Luis |