Feature: Account types

  @wip
  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the tittle contains "Calendar Events - Activities"
  @wip
  Scenario: Sales manager user
    Given the user logged in as "salesmanager"
    When the user navigates to "Customers" "Accounts"
    Then the tittle contains "Accounts - CustomerS"
  @wip
  Scenario: Store manager user
    Given the user logged in as "storemanager"
    When the user navigates to "Customers" "Contacts"
    Then the tittle contains "Contacts - Customers"


  Scenario Outline: Different user types
    Given the user logged in as "<usertype>"
    When the user navigates to "<tab>" "<module>"
    Then the tittle contains "<title>"
    Examples:
      |usertype      |tab       |module          |title                        |
      |driver        |Activities|Calendar Events |Calendar Events - Activities |
      |admin         |Customers |Accounts        |Accounts - Customers         |
      |salesmanager  |Customers |Accounts        |Accounts - Customers         |
      |storemanager  |Customers |Contacts        |Contacts - Customers         |


