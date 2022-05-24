@test-suite-desktop
Feature: As a user I want to validate the main functionalities of the website.

  #pre-condition
  Background:
    Given As a user I want to open the browser and go to the main page

  ###TEST-CASES###
  @TC-01
  @createanddelete
  Scenario Outline: Create an item
    Given <User> upload an image on the choose file button
    When <User> write a <description>
    And <User> clicks on the button to create item
    Then <User> can see your item added with its image and <description>
      | docker.png |
    Examples:
      | User | description                                                |
      | Luis | Docker takes away repetitive, mundane configuration tasks. |

  @TC-02
  Scenario Outline: Edit another existing item
    Given <User> click on the button edit an item with <description>
    When <User> writes something in the textarea <editDesc>
    Then <User> can see the changes
      | Mike is playing the piano now... |
    Examples:
      | User | description           | editDesc                         |
      | Luis | Mike plays the guitar | Mike is playing the piano now... |

  @TC-03
  @createanddelete
  Scenario Outline: Delete the item created
    Given <User> identify your item created with <description> and click on the button delete
    When <User> validate delete in modal
    Then <User> verify that the item doesn't exist
      | Docker takes away repetitive, mundane configuration tasks. |
    Examples:
      | User | description                                                |
      | Luis | Docker takes away repetitive, mundane configuration tasks. |

  @TC-04
  Scenario Outline: Check max long in description
    Given <User> select random item
    Then <User> check the length of the item correctly
    Examples:
      | User |
      | Luis |

  @TC-05
  Scenario Outline: Check if exist in the list the item with text “Creators: Matt Duffer, Ross Duffer”
    Given <User> search the item
    Then <User> verify that the description is correct
    Examples:
      | User |
      | Luis |