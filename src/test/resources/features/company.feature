Feature:
  User Story : As a user, I should be able to access the “Company” page .

  Acceptance Criteria:
  1. Verify that user sees the 7 modules in the “Company” page.
  - Verify the module names, not just the numbers of the modules.

  Background:
    Given the user is on the login page

  @comp
  Scenario Template: verify user is able to access the company page
    When the user logs in as "<user type>"
    When user clicks on company
    Then user sees 7 modules in the page

    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |