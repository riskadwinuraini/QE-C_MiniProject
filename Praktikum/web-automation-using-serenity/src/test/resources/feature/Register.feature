Feature: register alta shop

  Scenario: register with valid credentials
    Given I am on the register page
    When I input valid Nama Lengkap
    When I input valid Email
    When I input valid Password
    And I click register button
    Then I am on the Login Page

