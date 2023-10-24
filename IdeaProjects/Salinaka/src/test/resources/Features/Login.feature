Feature: Login with valid data
  Scenario Outline: user can able to Login Validation
    Given I navigate to the Website
    And I am in sign in page
    When I enter "<email>" and "<password>" to login Page
    And User click on sign-in button
    Then Validate the user logo after login
  Examples:
    | email | password |
    | brindhasengu@gmail.com | Asdf1234 |
    | brindhasengu@gmail.com | Asdf1234 |





