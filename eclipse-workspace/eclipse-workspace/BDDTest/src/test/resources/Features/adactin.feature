@tag
Feature: user is able to login to Adactin page

  @login1
  Scenario: check login crediantials
    Given user is login page
    When enter username and password
    And click on login button
    Then user is able to navigate to homepage
