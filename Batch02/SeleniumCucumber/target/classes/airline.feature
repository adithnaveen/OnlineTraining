@AirLine
Feature: Travel between to locations 

# which similar to Before in junit  
Background: 
	Given Chrome Browser 
	When airline pom
	
Scenario Outline: 
	Given click on flights tab 
	And enter "<flyfrom>" the src location 
	And enter "<flyto>" the dest location 
	And enter depature date "<deaprtdate>" 
	And enter arrival date "<returning>"
	When click on search button 
	Then show the flight information 
	Then close browser
	
Examples: 
|flyfrom		|flyto			|deaprtdate					|returning			|
|Washington, DC (WAS-All Airports)| San Francisco, CA (QSF-All Airports)| 20|22| 
|Bengaluru, India (BLR-Kempegowda Intl.) |Washington, DC, United States (IAD-Washington Dulles Intl.) | 22 | 25|
|New York, NY, United States (JFK-John F. Kennedy Intl.)|San Jose, Costa Rica (SJO-All Airports)| 20 |25| 