Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

 @smokeTest @Regresion @functionalTestCases
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'Zainab.zahir@tekschool.us' and password 'Muska2323!'
    And User click on login button
    Then User should be logged in into Account
    And User click on logout option

@dryRun @smokeTest @Regresion @registerAccount
  Scenario: Verify user can create an account into Retail Website
 
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email             | password   | confirmPassword |
      | panthers | ugc.zai@gmail.com | Muska2323! | Muska2323!      |
    And User click on SignUp button
    Then User should be logged into account page
