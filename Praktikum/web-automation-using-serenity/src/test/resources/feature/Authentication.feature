Feature: Alta shop

  Scenario: As a user I have successfully registered
    Given me on the register page
    When I enter a full name "riskadwinuraini"
    And I entered a email "riskadwi583@gmail.com"
    And I entered a password "Riskaya123"
    And I click the register button
    Then I'm on the login page

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter email "riskadwi583@gmail.com"
    And I enter password "Riskaya123"
    And I click login button
    Then I am on the home page

