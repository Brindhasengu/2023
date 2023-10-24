Feature: file to verify weather the appropriate application is open or not
  Scenario: user check functionality of application
  Given user open the Browser
  Then User enters url "https://www.amazon.co.uk/".
  And verify the title of window
  Then Close the browser