@all
Feature: Checkbox multi-selection


  @checkbox
  Scenario Outline: User should be able to select more than one anlagens by checkboxes
    Given User logged in as a betreiber
    When User clicks on the eye icon "<id>"
    And User clicks on select all checkbox
    Then Verify all checkboxes are selected

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
