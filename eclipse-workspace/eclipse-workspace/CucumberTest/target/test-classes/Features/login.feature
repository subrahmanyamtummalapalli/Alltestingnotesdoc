Feature: User is able to login to Adactin page

  Scenario: User login
    Given Login page
    When  User enters username and password
    And   Click on login button
    Then  User is able to login to Homepage

  