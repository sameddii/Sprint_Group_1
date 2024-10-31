Feature: US: Appreciation functionality

  Acceptance Criteria: Verify that user can send an appreciation message

  Background:
    Given user is on the login page


  @appreciation
  Scenario Template: Verify login with valid credentials
    When user logs in as "<user type>"
    And user clicks the more menu
    And user clicks appreciation
    And user should be able to enter "<message>"
    Then user should see the message displayed on the feed

    Examples:
      | user type | message   |
      | hr        | Thank you |
      | helpdesk  | Merci     |
      | marketing | Danke     |