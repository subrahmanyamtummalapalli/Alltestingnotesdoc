Feature: Registration functionality

Scenario: User can register with valid data
  Given User is on the registration page
  When User enters valid username and email and password
  And User clicks the register button
  Then User should be registered successfully
