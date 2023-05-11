
Feature: Authentication

  @Register
  Scenario: As a user Register with a valid email and password
    Given me on the register page
    When I enter a full name "riskaya simnida"
    And I entered a email "riskayasimnida123@gmail.com"
    And I entered a password "aku123"
    And I click the register button
    Then I'm on the login page


    @Register
      Scenario: As a user I registered with incorrect data filled numbers
      Given me on the register page
      When I enter a full name "r1sk4 dwi1 nur41n1"
      And I entered a email "riskayasimnida124@gmail.com"
      And I enter password "aku123"
      And I click the register button
      Then I'm on the login page

  @Register
  Scenario: As a user I register with registered email
    Given me on the register page
    When I enter a full name "riska"
    And I entered a email "riskayasimnida123@gmail.com"
    And I entered a password "riska"
    And I click the register button
    Then I can see error message

  @Register
  Scenario: As a user I register with incomplete data
    Given me on the register page
    When I enter a full name "riskaya haha"
    And I entered a email "riskadwi897@gmail.com"
    And I entered a password ""
    And I click the register button
    Then I can see error message

  @Register
  Scenario: As a user I do not register use email format
    Given me on the register page
    When I enter a full name "riske"
    And I entered a email "riskea#gmail.com"
    And I entered a password "riskea1"
    And I click the register button
    Then I'm on the login page

  @login
  Scenario: As user I have be able to success login
    Given I am on the login page
    When I enter email "riskayasimnida123@gmail.com"
    And I enter password "aku123"
    And I click login button
    Then I am on the home page

  Scenario: As user I have be able to failed login with account unregistered
    Given I am on the login page
    When I enter email "riskadwi589@gmail.com"
    And I enter password "Riskaya123"
    And I click login button
    And I can see error message

  Scenario: As user I have be able to failed login with invalid password
    Given I am on the login page
    When I enter email "riskayasimnida123@gmail.com"
    And I enter password "aku123"
    And I click login button
    Then I can see error message

  Scenario: As user I have be able to failed login with password not filled
    Given I am on the login page
    When I enter email "riskadwi583@gmail.com"
    And I enter password ""
    And I click login button
    Then I can see error message

  Scenario: As user I have be able to failed login with email not filled
    Given I am on the login page
    When I enter email ""
    And I enter password "Riskaya123"
    And I click login button
    Then I can see error message

  Scenario: As user I have be able to failed login with email and password not filled
    Given I am on the login page
    When I enter email ""
    And I enter password ""
    And I click login button
    Then I can see error message




