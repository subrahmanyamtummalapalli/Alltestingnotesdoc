#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag 
Feature: Login
@tag1
Scenario Outline: verifying valid Login 
Given Open login page 
When Enter username as <un>
When Enter password as <pwd> and click on login button
Then Home page
Examples: 
| un          | pwd      |
| Thippesh    | Thippesh |
| saikiran147 | Ojas123! |
| veerasubrahmanyam|Raghu@12345|