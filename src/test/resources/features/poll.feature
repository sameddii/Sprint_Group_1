Feature: Poll Functionality

  As a user, I should be able to create a poll

  Acceptance Criteria:

  1. User should be able to create a simple poll with a question and 2 answers.
   Successfully created poll should be displayed in the feed.
  2. User should be able to cancel a poll.
  - Poll message area should collapse after clicking the “Cancel” button.


  Background:
    Given the user is on the login page


  Scenario Outline: Verify user can create a poll
    When the user logs in as "<user type>"
    When user navigates to poll page
    And user creates a poll with a question and two answers
    Then user sees the poll in the feed


    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |


    Scenario Outline: Verify user can cancel the poll
      When the user logs in as "<user type>"
      And user navigates to poll page
      When user cancels the pool
      Then poll message area collapses


      Examples:
        | user type |
        | hr        |
        | helpdesk  |
        | marketing |


