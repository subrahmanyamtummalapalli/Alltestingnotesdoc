Feature: Login Adactin page

  Scenario: User able to login
    Given Navigate to login page
    When Enter Username
    And Enter Password
    And Click on Login
    Then Validate user is able to login Successfully

    Scenario: Search hotel page
    Given Select all dropdowns in search hotel
    When Click on search button
    Then Validate user is able to search hotel

    
