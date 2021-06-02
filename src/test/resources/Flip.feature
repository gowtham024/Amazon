Feature: checking amaxon cart  Functionality

  Scenario: validating add to cart functionality
    
    Given user open the Login page
    When  user logging into page wth valid username and password
    And  user adding a product to cart
    Then  user is able to add the prodcut to cart or not

