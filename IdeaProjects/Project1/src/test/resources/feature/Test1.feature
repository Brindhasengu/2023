Feature: file to verify weather the appropriate application is open or not
  Scenario: user check functionality of application
  Given user open the Browser
  Then User enters url "www.amazon.co.uk"
  And verify the title
  Then Close the browser