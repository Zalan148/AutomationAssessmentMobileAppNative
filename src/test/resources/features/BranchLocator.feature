Feature: Branch Locator
  As a user of Waterstones app,
  I want to be able to search for a branch,
  So that I can purchase from that branch


  Scenario: Able to search for a branch (negative test)
    Given the Waterstones app is open
    When I click Shops button
    And enter a country
    Then the search results for that country are displayed

  Scenario: Able to search for a branch
    Given the Waterstones app is open
    When I click Shops button
    And enter a city
    Then the search results for that city are displayed