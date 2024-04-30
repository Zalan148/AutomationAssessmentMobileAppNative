Feature: Wish List
  As a user of Waterstones app,
  I want to be able to add a list of favorites,
  So that I can make a purchase of favorites in the future


  Scenario: Able to add a Wish List
    Given the Waterstones app is open
    When I search for a book
    And I add the book to a Wish List
    And I click the Wish Lists button
    Then the book is added to the Wish List