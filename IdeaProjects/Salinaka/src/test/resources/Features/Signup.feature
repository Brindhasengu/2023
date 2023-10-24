Feature: signup the application with valid data and invalid data
  Scenario: Signup page is available
    Given The user is at the web app.
    Then  signup button is available
    When  clicking on signup button
    Then  Signup page is loaded
    Then  signup page has name,email,password

  Scenario: Signup attempt with invalid data gives error
    Given  The user is in Sign Up page.
    When Fullname is left blank
    Then Fullname required error is diplayed
    When Email id is blank
    Then Email is required error is displayed
    When Password is left blank
    Then Password is required error is displayed

  Scenario: Signup with valid data is successful
    Given  The user is in Sign Up page.
    When Fullname, email and password are entered
    Then Signup is successful





