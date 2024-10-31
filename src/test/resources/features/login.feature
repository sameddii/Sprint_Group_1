@login
Feature: Login Functionality

  As a user, I should be able to login

  Acceptance Criteria:
  1-Users should be able to login with valid credentials and should land on the home page after successful login.
  (We have 3 types of users such as HR user, Marketing user, and Helpdesk user).
  2-"Incorrect login or password" should be displayed for invalid (valid username-invalid password and invalid
  username-valid password) credentials
  3- "Please fill out this field" message should be displayed if the password or username is empty
  4-User can see "Remember Me" link exists and is clickable on the login page
  5-User should see the password in bullet signs by default

  Background:
    Given the user is on the login page

  @login
  Scenario Template: Verify login with valid credentials
    When the user logs in as "<user type>"
    Then the user should land on the home page and the "<title>" should be displayed
    Examples:
      | user type | title  |
      | hr        | Portal |
      | helpdesk  | Portal |
      | marketing | Portal |


  Scenario Template: Verify login with valid user name and invalid password
    When the user enters a valid "<username>" and an invalid "<password>"
    Then the "<error message>" should be displayed
    Examples:
      | username      | password  | error message               |
      | hrUser        | Useruser  | Incorrect login or password |
      | helpdeskUser  | userUser  | Incorrect login or password |
      | marketingUser | UserUsers | Incorrect login or password |


  Scenario Template: Verify login with invalid user name and valid password
    When the user enters an invalid "<username>" and a valid "<password>"
    Then the "<error message>" should be displayed
    Examples:
      | username              | password          | error message               |
      | hr888@cydeo.com       | hrPassword        | Incorrect login or password |
      | helpdesk88@ cydeo.com | helpdeskPassword  | Incorrect login or password |
      | marketing88cydeo.com  | marketingPassword | Incorrect login or password |


  Scenario Template: Verify login attempt with missing credentials
    When the user logs in with missing "<user name>" and_or "<password>" fields
    Then the "<error message>" should be displayed
    Examples:
      | user name | password         | error message              |
      | hrUser    |                  | Please fill out this field |
      |           | helpdeskPassword | Please fill out this field |
      |           |                  | Please fill out this field |


  Scenario: Verify "Remember me" option is visible and clickable
    Then the "Remember me on this computer" text should be visible
    When the user clicks the Remember me checkbox
    Then the Remember me checkbox should be selected


  Scenario: Verify password is hidden by default
    When the user enters a password
    Then the password should be masked with bullets by default










