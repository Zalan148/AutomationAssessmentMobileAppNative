Feature: Account
  As a user of Waterstones app,
  I want to be able to sign in or register,
  So that I can access my saved personal details


  Scenario: Access personal details
    Given the Waterstones app is open
    When I click Account
    Then I can either sign in or register