Feature: Alta shop

  @register
  Scenario: As a user I have successfully registered
    Given me on the register page
    When I enter a full name "riskadwinuraini"
    And I entered a email "riskadwi583@gmail.com"
    And I entered a password "Riskaya123"
    And I click the register button
    Then I'm on the login page

    Scenario: As a user I registered with incorrect data filled numbers
      Given me on the register page
      When I enter a full name "r15k4 dw1 nur 4ini"
      And I entered a email "riskadwi612@gmail.com"
      And I entered a password "Riskaya123"
      And I click the register button
      Then I'm on the login page

      Scenario: As a user I registered with incorrect data filled character
        Given me on the register page
        When I enter a full name "r!$ka dw! nur *ini)"
        And I entered a email "riskadwi613@gmail.com"
        And I entered a password "Riskaya123"
        And I click the register button
        Then I'm on the login page

        Scenario: As a user I register with the data that has been registered
          Given me on the register page
          When I enter a full name "riskadwinuraini"
          And I entered a email "riskadwi583@gmail.com"
          And I entered a password "Riskaya123"
          And I click the register button
          Then I can see error message

          Scenario: As a user I registered with incomplete data
            Given me on the register page
            When I enter a full name ""
            And I entered a email "riskadwi614@gmail.com"
            And I entered a password "Riskaya123"
            And I click the register button
            Then I can see error message

  @login
  Scenario: As user I have be able to success login
    Given I am on the login page
    When I enter email "riskadwi583@gmail.com"
    And I enter password "Riskaya123"
    And I click login button
    Then I am on the home page

    Scenario: As user I have be able to failed login with account unregistered
      Given I am on the login page
      When I enter email "riskadwi588@gmail.com"
      And I enter password "Riskaya123"
      And I click login button
      And I can see error message "record not found"

      Scenario: As user I have be able to failed login with invalid password
        Given I am on the login page
        When I enter email "riskadwi583@gmail.com"
        And I enter password "Riskaya612"
        And I click login button
        Then I can see error message "email or password is invalid"

        Scenario: As user I have be able to failed login with password not filled
          Given I am on the login page
          When I enter email "riskadwi583@gmail.com"
          And I enter password ""
          And I click login button
          Then I can see error message "password is required"

          Scenario: As user I have be able to failed login with email not filled
            Given I am on the login page
            When I enter email ""
            And I enter password "Riskaya123"
            And I click login button
            Then I can see error message "email is required"

            Scenario: As user I have be able to failed login with email and password not filled
              Given I am on the login page
              When I enter email ""
              And I enter password ""
              And I click login button
              Then I can see error message "email is required"

