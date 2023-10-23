Feature: Edit by default



  Scenario Outline: Test if the anlagen formular is editable by default
    Given User logged in as a betreiber
    When User clicks on the eye icon
    And User clicks on the eye icon of anlagen "<id>"
    Then Verify forms are editable by default

    Examples:
    |id|
    |2|
    |3|