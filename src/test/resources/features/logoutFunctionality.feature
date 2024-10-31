Feature:
  User Story :
  As a user, I should be able to log out.

  Acceptance Criteria:
  1. Verify that user sees the 5 options under the profile name.
  2. Verify that user logs out from the app after clicking the “Log Out” button.
  3. Verify that user is logged out if they are away from keyboard for 3 minutes.
    (If user does not do any mouse or keyboard action for 3 minutes)


  Background:
    Given the user is on the login page


    @sc1
  Scenario Template:
    When the user logs in as "<user type>"
    And user clicks on profile
    Then user sees options
    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |


      @sc2
  Scenario Template:
    When the user logs in as "<user type>"
    And user clicks on profile
    And user clicks logout
    Then user is logged out
    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |


  @sc3
  Scenario Template:
    When the user logs in as "<user type>"
    And user clicks on profile
    And user clicks logout after 3 minutes
    Then user is logged out
    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |
