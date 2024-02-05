
@tag
Feature: Login to Adactin with multiple Usernames and Passwords

  @tag1
  Scenario Outline: Verify the Username and Passwords
    Given Go to Adactin Login page
    When  Enter Username as <Username>
    When  Enter Password as <Password> and click on login
    Then  Validate user is able to login

    Examples: 
      | Username       | Password          |
      | Thippesh       | Thippesh          |
      | saikiran147    | Ojas123!          |
      | vinaychennuri1 | 9947WJ            |
      