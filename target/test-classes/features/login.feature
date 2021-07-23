@login # it will assign @login to all scenario.So we can run all scenarios by using tags = "@login"
Feature: Users should be able to login

  # it implements the codes at the beginning of each different scenario
  Background:
    Given the user is on the login page

  @driver @VYT-123
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login
  @sales_manager @VYT-123
  Scenario:Login as a sales manager
    When the user enters the sales manager information
    Then the user should be able to login

  @store_manager @smoke
  Scenario:Login as a store manager
    When the user enters the store manager information
    Then the user should be able to login