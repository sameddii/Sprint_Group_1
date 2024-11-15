@activitystream
Feature: Activity Stream Page

  User Story:
  As a user, I should be able to see all the options on the Activity stream page

  Acceptance Criteria:
  1. user should view the following options on Activity stream page
  -MESSAGE
  -TASK
  -EVENT
  -POLL
  -MORE

  2.Verify that user can view the following 4 options under the MORE tab
  -File
  -Appreciation
  -Announcement
  -Workflow

  Background:
    Given user is on the login page


    Scenario Outline: Verify that user can view the following options on Activity stream page
      -MESSAGE
      -TASK
      -EVENT
      -POLL
      -MORE

      When user logs in as "<user type>"
      Then user sees the MESSAGE,TASK,EVENT and MORE options in top menu

      Examples:
        | user type |
        | hr        |
        | helpdesk  |
        | marketing |


      Scenario Outline: Verify that user can view the following options under the MORE tab
        When user logs in as "<user type>"
        And user clicks MORE tab
        Then user sees FILE,APPRECIATION,ANNOUNCEMENT and WORKFLOW options under the MORE tab



      Examples:
        | user type |
        | hr        |
        | helpdesk  |
        | marketing |
