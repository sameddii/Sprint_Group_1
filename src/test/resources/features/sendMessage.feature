Feature:
  User Story : As a user, I should be able to send messages.

  Acceptance Criteria:

  1. Verify that user can send simple text messages on the “Activity Stream” page.

  - The message should be displayed on top of the feed.

  2. Verify that user can cancel sending a message by clicking the “Cancel” button.

  - Message area should collapse after clicking the “Cancel” button.

  Background:
    Given the user is on the login page

  @working1
  Scenario Template: Verify login with valid credentials
    When the user logs in as "<user type>"
    And user clicks message area
    When user should be able to type "<message>"
    Then user should see message on top of the screen

    Examples:
      | user type | message           |
      | hr        | Hi, how are you?  |
      | helpdesk  | Agile Ceremonies  |
      | marketing | Automation Sprint |


  @working2
  Scenario Template: Verify login with valid credentials
    When the user logs in as "<user type>"
    And user clicks message area
    Then user should be able to type "<message>" and cancel it

    Examples:
      | user type | message           |
      | hr        | Hello             |
      | helpdesk  | Cydeo             |
      | marketing | Sprint Automation |