# this feature is for login 
@Smoke 
Feature: Login to web application 

# hooks are the business logic which runs before each 
# scenario, and these are local only to the feature 
# file which is written 
Background: 
	Given the path is set 

# steps 
Scenario Outline: 
	Given the browser is "<browser_status>" 
	When user name is "<entering_status>"
	And the password is entered 
	Then validate the user credentials 
	
Examples: 
	| browser_status			| 		entering_status			|
	|			open						|			   entered					| 
	|			open						|			enterednumbers			|
	| 		open						| 		enteredsplchars			|
	|			open						|	    	notenerted				|
	|		notopen						|				entered						|
	|		notopen						|				enterednumbers		| 	