@services
Feature: Services page feature
  User story: As a user, I should be able to access  the “Services” page
  Acceptance criteria :
  1. User should be able to see the 11 modules on the “Services” page shown as the design document.
  2. User should be able to access the FAQ documents.
  User types: helpdesk, marketing, hr

  Background:
    Given the user is on the login page

  @services_modules
  Scenario Outline: Verify that users are able to see the 11 modules on the “Services” page shown as the design document.
    When the user logs in as "<user type>"
    When user navigates to Services tab on the home page
    Then user sees 11 modules in top menu
    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |

  @services_faq
  Scenario Outline: Verify that users are able to access the FAQ documents.
    When the user logs in as "<user type>"
    When user navigates to Services tab on the home page
    And user navigates to FAQ module
    Then user sees FAQ documents on the FAQ page
    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |