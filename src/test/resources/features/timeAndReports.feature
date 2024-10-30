@timeAndReports
Feature: Time and Reports Page functionality

  As a user, I should be able to access the “Time and Reports” page.

  Acceptance Criteria:
  1. User should be able to see the 5 modules on the “Time and Reports” page.
  2. User should be able to see 2 checkboxes on the “Worktime” module.
  3. “Statistics” checkbox should be selected by default.

  Background:
  Given the user is on the login page

  Scenario Outline: Verify user can see "Time and Reports" page contains 5 modules.
    When the user logs in as "<user type>"
    And user goes to Time and Reports page
    Then user should see 5 modules on the page

    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |


    Scenario Outline: Verify user can see 2 checkboxes on the "Worktime" module.
      When the user logs in as "<user type>"
      And user goes to Time and Reports page
      And user navigates to Worktime module
      Then user sees 2 checkboxes on the Worktime module.

      Examples:
        | user type |
        | hr        |
        | helpdesk  |
        | marketing |


      Scenario Outline:Verify user can see the ‘Statistics’ checkbox selected by default on the "Worktime" module.
        When the user logs in as "<user type>"
        And user goes to Time and Reports page
        And user navigates to Worktime module
        Then user sees ‘Statistics’ checkbox selected by default


        Examples:
          | user type |
          | hr        |
          | helpdesk  |
          | marketing |
