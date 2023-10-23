@all
Feature: Import and Export functionalities



  Scenario Outline: Make Import icon visible for behoerde user
    Given User logged in as a behoerde
    When User clicks on the eye icon "<id>"
    Then Verify Import icon is displayed and clickable

    Examples:
      |id|
      |1|
      |2|
      |3|
      |4|
      |5|
      |6|
      |7|
      |8|
      |9|
      |10|

  Scenario Outline: Make Export icon visible for behoerde user
    Given User logged in as a behoerde
    When User clicks on the eye icon "<id>"
    Then Verify Export icon is displayed and clickable

    Examples:
      |id|
      |1|
      |2|
      |3|
      |4|
      |5|
      |6|
      |7|
      |8|
      |9|
      |10|