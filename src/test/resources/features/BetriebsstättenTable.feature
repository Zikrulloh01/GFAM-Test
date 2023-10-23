@all
Feature: Betriebsstätten Table contents Test


  @run
  Scenario: Sidebar collapse year dropdown should be visible
    Given User logged in as a betreiber
    When User closes the sidebar
    Then Verify year dropdown is visible