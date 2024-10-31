@timeAndReports
Feature: Time and Reports Page functionality

  As a user, I should be able to access the “Time and Reports” page.

  Acceptance Criteria:
  1. User should be able to see the 5 modules on the “Time and Reports” page.
  2. User should be able to see 2 checkboxes on the “Worktime” module.
  3. “Statistics” checkbox should be selected by default.

  Background:
  Given the user is on the login page

  Scenario Outline: Verify user can access to "Time and Reports" Menu
    When the user logs in as "<user type>"
    And user goes to Time and Reports page
    Then user should see 5 modules on the page
    And user navigates to Worktime module
    Then user sees 2 checkboxes on the Worktime module.
    Then user sees ‘Statistics’ checkbox selected by default

    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |
