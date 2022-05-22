@test-suite-desktop
Feature: As a user I want to validate the main functionalities of the website.

  #pre-condition
  Background:
    Given As a user I want to open the browser and go to the main page

  ###TEST-CASES###
  @TC-01
  Scenario Outline: Create an item
    Given <User> upload an image on the choose file button
    When <User> write a <description>
    And <User> clicks on the button to create item
    Then <User> can see your item added with its image and <description>
      | docker.png |
    Examples:
      | User | description                                                                                                                                                     |
      | Luis | Docker takes away repetitive, mundane configuration tasks and is used throughout the development lifecycle for fast, easy and portable application development. |