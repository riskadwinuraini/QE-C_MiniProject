
Feature: As a user i have be able to login so that i can see home screen

  Scenario: As a user i cant login because invalid password
    Given user on login page
    When user input valid username
    And user input invalid password
    And user click login button
    Then user see error message Wrong Email or Password

  Scenario: As a user i cant login because empty data
    Given user on login page
    When user didnt fill email
    And user didnt fill password
    And user click login button
    Then user see notification below boxes

  Scenario: As a user i cant login because invalid email and password
    Given user on login page
    When user input invalid username
    And user input invalid password
    And user click login button
    Then user see error message Wrong Email or Password

  Scenario: As a user i SUCCESS login with valid email and password
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    Then i got into dashboard again
