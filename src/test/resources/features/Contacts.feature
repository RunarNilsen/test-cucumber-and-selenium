Feature: Contacts page


  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1


  Scenario: Verify Create Calendar Event
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the tittle contains "Calendars"


  Scenario: Menu Options
    Given the user logged in as "driver"
    Then the user should see following options
          |  Fleet     |
          |  Customers |
          |  Activities|
          |  System    |

  Scenario: Menu Options
    Given the user logged in as "salesmanager"
    Then the user should see following options
      |  Dashboards             |
      |  Fleet                  |
      |  Customers              |
      |  Sales                  |
      |  Activities             |
      |  Marketing              |
      |  Reports & Segments     |
      |  System                 |


  Scenario: Login as a given driver
    Given the user is on the login page
    When the user logs in using following credentials
      |  username     |user10      |
      |  password     |UserUser123 |
      |  firstname    |Toney     |
      |  lastname     |Hegmann   |
    Then the user should be able to login

  @db
  Scenario: Contacts test with email
    Given the user logged in as "salesmanager"
    And the user navigates to "Customers" "Contacts"
    When the user clicks the "mbrackstone9@example.com" from contacts
    Then the information should be same with database

  @db
  Scenario: Contacts test with email
    Given the user logged in as "salesmanager"
    And the user navigates to "Customers" "Contacts"
    When the user clicks the "mike.jorden@hotmail.com" from contacts
    Then the information for "mike.jorden@hotmail.com" should be same with database

  @wip @db
  Scenario Outline: Contacts test with list of emails
    Given the user logged in as "salesmanager"
    And the user navigates to "Customers" "Contacts"
    When the user clicks the "<Email>" from contacts
    Then the information for "<Email>" should be same with database
    Examples:
      |Email|
      |mbrackstone9@example.com|
      |mike.jorden@hotmail.com|





