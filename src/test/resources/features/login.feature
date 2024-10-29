
Feature: User story : As a user, I should be able to login.
  Acceptance Criteria :
    Verify that user can log in with valid credentials and lands on the home page after successful login.
    Verify that "Incorrect username or password." message is displayed after invalid login attempt.

  @login
  Scenario: Verify that user can log in with valid credentials and lands on the home page after successful login.
    Given user goes to login page
    Then user types username
    And user types password
    Then user clicks login button
    And Verify if user on the dashboard




