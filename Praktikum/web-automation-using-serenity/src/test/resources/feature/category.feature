Feature: category alta shop

@category
  Scenario: As user I have be able to select category
    Given I am on the home page
    When I click select category
    And I click category gaming
    Then I can see product category message "Product is empty!"

  Scenario: As user I have be able to select category and click category
    Given I am on the home page
    When I click select category
    And I click category gaming
    Then I can see product category message "Product is empty!"
    And I click clear button
    And I go to home page
