@loschenBericht
Feature: Implementation of delete button on anlage level



  Scenario Outline: User should be able to see a delete button on top of the anlage table
    Given User logged in as a betreiber
    When User clicks on the eye icon "<id>"
    Then Verify there is a delete button on top of the anlage table

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

  Scenario Outline: Delete button should be disabled
    Given User logged in as a betreiber
    When User clicks on the eye icon "<id>"
    Then Verify delete button is disabled

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



  Scenario Outline: Delete button should be enabled when user selects the checkbox
    Given User logged in as a betreiber
    When User clicks on the eye icon "<id>"
    And User clicks on select all checkbox
    Then Verify Delete button is enabled

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



  Scenario Outline: User should be able to clear the anlage forms by clicking delete button
    Given User logged in as a betreiber
    When User clicks on the eye icon "<id>"
    And User clicks on select all checkbox
    And User clicks delete button and confirms deletion
    Then Verify there is a success message and Bearbeitungsstatus of anlage should be unbearbeitet

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
