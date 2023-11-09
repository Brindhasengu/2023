Feature: LoginTest
  Scenario Outline: user can able to Login Validation
  Given user launch the web app on browser
  And user is on the login page
  And user enter the user name and password
  And user clicks on the login CTA
  Then user should be able to login to the app
    Examples:
      | email | password |
      | superman |Admin123 |