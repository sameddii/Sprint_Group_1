@lube
Feature: Accessibility of the login page features
  As a user, I should be able to access the login page features.

  Acceptance Criteria:
  1-The title is displayed as "Authorization"
  2-"Authorization" Header exists and is displayed
  3-"Username or Email" input field exists and displayed "Username or Email"
  4-Password input field exists, displayed "Password" accepts password and masks it while typing for security.
  5-Login button exists and is clickable
  6-"FORGOT YOUR PASSWORD" link exists and is clickable and send the user to get password page
  7-"Remember Me" checkbox exists and is clickable
  #Remember for example me is already in the feature login --> do I need to add it also?
  #Questions to Baha about .getText()
  #Question to Baha about parameterization

  Background:
    Given the user is on the login page

Scenario: Verify title of the page is "Authorization"
  Then user should see the title named as "Authorization"


  Scenario: Verify "Authorization" Header text is displayed
    Then user should see "Authorization" Header text displayed


  Scenario: Verify "Username or Email" placeholder text is displayed on the username input field and is clickable
    Then user should see "Username or Email" placeholder text displayed on the username input field


 Scenario: Verify "Password" text is displayed on the password input field
    Then user should see "Password" text displayed on the password input field
    #Question to Baha
    # This one is already in the login.feature so do I need to test it? -->And while user is typing the password should be masked with bullets

  Scenario: Verify "Log In" button exists and is clickable
    Then user should see "Log In" text displayed on the login button
    Then user can click on the Log In button
    Then user should be see "Incorrect login or password" displayed


  Scenario: Verify forgot password link exists and is clickable
    Then user should see "FORGOT YOUR PASSWORD?" text displayed on the forgot link
    And user can click on the forgot password link
    Then user should be directed to this page with the title "Get Password"






















