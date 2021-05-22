Feature: My BDD Tests

  
 # Scenario: Testing Internet Site
  #  Given The user opens the Internet site
   # When The user clicks on Basic Auth link

	@debug
  Scenario: Testing ClearTrip
    Given The user opens ClearTrip
    When The user enters the below data and clicks on search
      | from      | Bengaluru  |
      | to        | Delhi      |
      | departsOn | 31/05/2021 |
    Then The user should see all the results
    Then The closes the session
