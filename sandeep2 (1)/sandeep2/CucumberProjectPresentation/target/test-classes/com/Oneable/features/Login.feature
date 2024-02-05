Feature: Login functionality scenarios
Scenario: Verify whether the user is able to login into the application 
    Given I launch the application
    And I navigate to Account Login page
    When I provide Valid username as "sandeep.velpula@ojas-it.com"
    And I click on the next button
    And I Provide valid password as "Test123$"
    And I click on Login button
    Then I will see the Dashboard page of the Oneable
