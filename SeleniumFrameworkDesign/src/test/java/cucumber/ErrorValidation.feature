@tag
Feature: Error Validaiton
	I want to use the this template for my feature file
	
	@ErrorValidation
	Scenario Outline:
	Given I landed on Ecommerce page
	When Logged in with username <name> and password <password>
	Then "Incorrect email or password." message is displayed
	
	
	Examples:
	|name|password|
	|ramsai14264@gmail.com|Rahul@sel|

