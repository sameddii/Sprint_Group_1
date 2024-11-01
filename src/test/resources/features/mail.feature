@All
Feature: Mail Functionality
  User Story : As a user, I should be able to send email via the “Mail” page.
  Acceptance Criteria:
  1. Verify that user can access to the “Mail” page.
  - “Use and manage your mailbox in Bitrix24” should be displayed.
  2. Verify that the 8 email service providers are displayed on the “Mail” page.
  - The “Mailbox Integration” window should be displayed and each email service provider should be clickable.
  - The names of the email service providers should be correct.

  Background:
    Given the user is on the login page

  @mail
  Scenario Outline:Verify that user can access to the “Mail” page.
    Given the user logs in as "<user type>"
    When the user should click on the mailbox
    Then Verify that "Use and manage your mailbox in Bitrix24" display

    Examples:
      | user type |
      | hr        |

  @email
  Scenario Outline: Verify email service providers on Mail page
    When the user logs in as "<user type>"
    And the user should click on the mailbox
    Then the user should see the "Mailbox Integration" window
    And the user should see 8 email service providers
    And the following email service providers should be displayed
      | service providers |
      | Gmail             |
      | Outlook           |
      | Yahoo             |
      | iCloud            |
      | AOL               |
      | Office365         |
      | Exchange          |
      | IMAP              |

    Then the user should be able to click and see the logo of each email service provider
      | logo               |
      | gmail              |
      | outlook.com        |
      | icloud             |
      | office365          |
      | exchange           |
      | yahoo              |
      | aol                |
      | other              |

    Examples:
      | user type |
      | hr        |
