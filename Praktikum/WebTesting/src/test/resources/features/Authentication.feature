
Feature: Authentication

  @Register
  Scenario: As a user Register with a valid email and password
    Given me on the register page
    When I enter a full name "gitaaaaaaa"
    And I entered a email "kkamu4567@gmail.com"
    And I entered a password "kamu789890"
    And I click the register button
    Then I'm on the login page

  @Register
  Scenario: As a user I register with registered email
    Given me on the register page
    When I enter a full name "gita leo"
    And I entered a email "benarsaja2121@gmail.com"
    And I entered a password "benarsaja2121"
    And I click the register button
    Then I can see error message

  @Register
  Scenario: As a user I register with incomplete data
    Given me on the register page
    When I enter a full name "gitle"
    And I entered a email "benarsaja2121@gmail.com"
    And I entered a password ""
    And I click the register button
    Then I can see error message

  @Register
  Scenario: As a user I register does not use email format
    Given me on the register page
    When I enter a full name "gitlelele"
    And I entered a email "apa#gmail.com"
    And I entered a password "12fiture"
    And I click the register button
    Then I'm on the login page

  @Login
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter email "Gitale40@gmail.com"
    And I enter password "gitale908989"
    And I click login button
    Then I am on the home page

  @Login
  Scenario: user input with unregistered email and password
    Given I am on the login page
    When I enter email "sayakembali23@gmail.com"
    And I enter password "sayakembali"
    And I click login button
    Then I can see error message

  @Login
  Scenario: As user login with input invalid email credentials of the field email
    Given I am on the login page
    When I enter email "gita444mail.com"
    And I enter password "seruuuu"
    And I click login button
    Then I am on the home page



