
Feature: User story : As a user, I should be able to login.
  Acceptance Criteria :
    Verify that user can log in with valid credentials and lands on the home page after successful login.
    Verify that "Incorrect username or password." message is displayed after invalid login attempt.

  Background: login to the page
    Given user go to login page


  @wip
  Scenario Outline: login with valid credentials
    When user enter "<email>"
    And user enter password
    When user click login button
    Then user should land on the page

    Examples:
      | email                 |
      | helpdesk22@cydeo.com  |
      | hr3@cydeo.com         |
      | marketing47@cydeo.com |


  @wip1
  Scenario Outline: verify message is displayed for failed attempts
    When user enter "<email>","<password>"
    And user click login button
    Then user should see the message


    Examples:
      | email                | password |
      |                      |          |
      | helpdesk13@cydeo.com |          |
      |                      | UserUser |




