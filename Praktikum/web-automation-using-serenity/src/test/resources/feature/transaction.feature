Feature: transaction alta shop

  @transaction
  Scenario: As user I make a product transaction
    Given I am on the login page
    When I enter email "riskadwi583@gmail.com"
    And I enter password "Riskaya123"
    And I click login button
    And I click buy button product
    And I click cart button
    Then I click pay button
    And I am on the transaction information page