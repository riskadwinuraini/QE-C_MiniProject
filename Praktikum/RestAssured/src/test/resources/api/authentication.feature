Feature: authentication

@authentication
  Scenario: view user information
    Given I set GET user api endpoints
    When I send a GET request to the user API endpoints
    Then I receive valid HTTP response code 200 for get user information
    And I receive valid data of the user
@authentication
    Scenario: Successful login
      Given I have valid credentials
      When I submit a POST request to "/auth/login" with email "riskash123@gmail.com" and password "Riskaya123"
      Then I receive valid HTTP response code Login 200
@authentication
      Scenario: Register using a valid full name, email and password
        Given I register using the correct data
        When I submit a POST request to "/auth/register" with fullname "riskashh", email "riskash123@gmail.com" and password "Riskaya123"
        Then I receive valid HTTP response code register 200
        And register successfully