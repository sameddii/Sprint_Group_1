@Task
Feature: CRM Tasks feature

  User Story:
  As a user, I should be able to create a task with the task title and task body and cancel a task.
  Accounts are: helpdesk, HR, marketing

  Acceptance Criteria:
  AC-1: Verify that user can create a simple task with the task title and task body.
  - successfully created task should be displayed in the feed.
  AC-2: Verify that user can cancel a task.
  - Task message area should collapse after clicking the “Cancel” button.


  Background:
    Given the user is on the login page

  @Task
  Scenario Outline: Users log in with valid credentials for different accounts
    When the user logs in as "<user type>"
    Then the user should see the dashboard.
    When users click on TASK button
    Then users enter the task title "Task US" on Things to do area
    And users enter the task body "<task body>" on task body area
    Then users click on the SEND button
    And User should see the task on Active Stream page

    Examples:
      | user type | task body                     |
      | helpdesk  | Helpdesk user creates a task  |
      | HR        | HR user creates a task        |
      | marketing | Marketing user creates a task |


  @Task
  Scenario Outline: users can cancel a simple task.
    When the user logs in as "<user type>"
    Then the user should see the dashboard.
    When users click on TASK button
    Then users click on CANCEL button
    And users should see the task message area has collapsed

    Examples:
      | user type |
      | helpdesk  |
      | HR        |
      | marketing |

















