# this feature is to show working of data table 
@Sanity

Feature: to process the loans for multiple people 

Scenario: 
	Given the user name and credit score 
		| username  | creditscore | 
		| srini     | 777         |
		| mohan     | 789         |
		| sridevi   | 776         |
		| harry     | 500         |
	When the criteria is met 
	# inject 
	Then sanction or reject the loan 
	
