Feature: Add to basket
  As a user of Waterstones app,
  I want to be able to add a book to a basket,
  So that I can make a purchase



  Scenario: Able to add to basket
    Given the Waterstones app is open
    When I select non-fiction books link
    And I search for a non-fiction book
    And I select the non-fiction book from the search results
    And I click Add to basket
    Then the book is added to the basket