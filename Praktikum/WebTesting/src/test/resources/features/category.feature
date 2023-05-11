Feature: Category

  @category
  Scenario: As user i have be able to select category
    Given I am on the home page
    When I click select category
    And I click category Furniture
    Then I can see product category message "Products is empty!"