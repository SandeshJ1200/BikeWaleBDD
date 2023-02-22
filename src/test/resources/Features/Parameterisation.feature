Feature: This feature explains parameterization in Cucumber

Scenario: Parameterize each step
	Given I have following numbers:
	|11|3|
	|21|22|
	|14|28|
	|6|9|
	When I add them
	Then the addition must be even
	
Scenario Outline: This is a data driven test case
	Given I have <num1> and <num2>
	When I add them
	Then the addition must be even
Examples:
|num1|num2|
|19|95|
|21|22|
|14|28|
|6|9|

Scenario Outline: Data Driven Scenario using Excel data
	Given I have <row_num>
	When I add them
	Then the addition must be even
Examples:
	|row_num|
	|2|
	|3|
	|4|
	
	
	