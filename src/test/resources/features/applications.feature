Feature:
  User Story: As a user, I should be able to see different device options to download the different applications


  Background:
    Given the user is on the login page

  @application_modules
  Scenario Outline: Verify that users are able to see the Applications tab and options.
    When the user logs in as "<user type>"
    When user navigates to the More tab on Home Page
    Then user clicks on Applications Button
    Then verify user is seeing Application Page
    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |

  @application_install
  Scenario Outline: User can view different applications and install
    When the user logs in as "<user type>"
    When user navigates to the More tab on Home Page
    When user clicks on Applications Button
    Then count all 16 modules
    Then inspect all modules and confirm Install button working

    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |