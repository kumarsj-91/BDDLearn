Feature: Home Page 

Background: 
	Given launchApp "www.google.com" 
	
	
Scenario: Search 

	When home page is available 
	Then search the keyword "cucumber tutorials" 
	
Scenario: Verify 
	When home page is available 
	Then Verify the home page UI Elements