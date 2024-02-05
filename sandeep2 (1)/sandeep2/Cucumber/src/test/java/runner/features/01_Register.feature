@tag1
Feature: Registration functionality
As a user, should be register to the account
Scenario: Register into Account
Given user navigates to registration page
When user enters below details
|firstname        |sandeep|
|lastname         |velpula|
|email            |sandy1519467837@gmail.com|
|telephone        |9347442936|
|password         |sandeep|
|confirm          |sandeep|
And clicks on privacy policy checkbox
And clicks on continue button
Then user registered into account successfully message should be displayed

@tag2
Scenario: Title of your scenario
    Given Clicks on login button1
    When user enters valid username"sandy1519467837@gmail.com"
    And user enters valid password"sandeep"
    And Clicks on login button
    Then Successful message should be displayed 

