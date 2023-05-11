Feature: transaction
@transaction
Scenario: As user i make a product transaction
Given I am on the login page
When I enter email "Gitale40@gmail.com"
And I enter password "gitale908989"
And I click login button
And I click buy button product
And I click cart button
Then I click pay button
And I am on the transaction information page