Feature: Search
  As a user of Waterstones app,
  I want to be able to search for a book,
  So that I can make a purchase


  Scenario: Able to perform a search
    Given the Waterstones app is open
    When I search for a book
    Then the search results are displayed