@tag2
Feature: Login functionality
  Scenario: login
    Given Clicks on login button1
    When user enters valid username"sandy1519467852@gmail.com"
    And user enters valid password"sandeep"
    And Clicks on login button
    Then Successful message should be displayed 