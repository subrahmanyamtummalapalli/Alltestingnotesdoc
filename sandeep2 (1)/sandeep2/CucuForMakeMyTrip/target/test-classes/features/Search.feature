Feature: Trains search functionality

  Scenario: Search functionality for make my trip
  
    Given User navigates to trains page 
   
    When user enters from address as "Hyd"
    And  user enters to address as "Singarayakonda"
    And user select specific date from travel date option
    And user select the type of the class
   Then Clicks on the search button

 