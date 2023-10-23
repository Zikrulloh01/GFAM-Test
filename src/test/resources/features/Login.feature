@all
Feature: Login


  @login
  Scenario: Login as a username
    Given User goes to the url
    When User enters username
    And User enters password
    And User clicks sign in button
    Then Verify user is on GFA page
