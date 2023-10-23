@all
Feature: Anlagens' Table




  Scenario Outline: Anlagen table columns sequence test
    Given User logged in as a betreiber
    When User clicks on the eye icon "<id>"
    Then Verify the table column sequence

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



