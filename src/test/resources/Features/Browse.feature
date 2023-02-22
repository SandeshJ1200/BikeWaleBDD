Feature: This feature file contains scenarios related to the 'Browse Bikes By' product search funtionality


	Scenario: To Verify if Displayed Bike Prices are Under Two Lakh if User clicks on 'Under 2 Lakh' in 'Browse Bikes By' section.
    Given User clicks on Budget Tab under 'Browser Bikes by' section
    And clicks on 'Under 2 Lakh'
    Then check if all bike prices are Under 2 lakh

	Scenario: To Verify if Displayed Bike Prices are Above Two Lakh if User clicks on 'Above 2 Lakh' in 'Browse Bikes By' section.
		Given User clicks on Budget Tab under 'Browser Bikes by' section
		And clicks on 'Above 2 Lakh'
		Then check if all bike prices are Above 2 lakh
		
	Scenario: To Verify if User Selects '250cc-500cc' Displacement Size in 'Browse Bikes By' section, Correct bikes are shown.
		Given User clicks on 'Displacement' Tab under 'Browser Bikes by' section
		And click on '250cc-500cc' segment
		Then check if all bike engine sizes are within '250cc-500cc'
		
	Scenario: To Verify if User Selects 'Above 500cc' Displacement Size in 'Browse Bikes By' section, Correct bikes are shown.
		Given User clicks on 'Displacement' Tab under 'Browser Bikes by' section
		And click on 'Above 500cc' segment
		Then check if all bike engine sizes are above '500cc'
		
		
