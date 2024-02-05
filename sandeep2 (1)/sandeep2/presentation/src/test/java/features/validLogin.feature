Feature: login functionality

Scenario: with valid data
Given user navigates to login page
When user enters valid email as <email>
And user clicks on next button
And user enters valid password as <pwd>
And clicks on login button
Then Home Page displayed
