@tag1
Feature: Registration functionality
As a user, should be register to the account
Scenario: Register into Account
Given user navigates to registration page
When user enters below details
|firstname        |sandeep|
|lastname         |velpula|
|email            |soniya@gmail.com|
|telephone        |9347442936|
|password         |sandeep|
|confirm          |sandeep|
And clicks on privacy policy checkbox
And clicks on continue button
Then user registered into account successfully message should be displayed

