Feature: login

  Scenario: As user I have be able to success login
    Given I am on the login page
    When I enter valid Email
    And I enter valid Password
    And I click the enter login
    Then I am on the home page