Feature: This feature file contains tests related to 

  Scenario: To Verify if Displayed Bike Prices are Under Two Lakh if User clicks 
  					on 'Under 2 Lakh' in Browse Bikes By section.
    Given User clicks on Budget Tab option under Browser Bikes by section
    And clicks on 'Under 2 Lakh'
    Then checks if all bike prices are under 2 lakh
