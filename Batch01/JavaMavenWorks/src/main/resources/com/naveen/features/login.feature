@Sanity
Feature: Login Feature 

Scenario:
	Given username and password 
	# there shall be values which can be passed 
	|login  | pwd |  roles | 
	|larry  | larrypwd| manger   |
	|harry  | harrypwd| teamleader |
	|peter  | peterpwd| developer   |
	When login successful 
	Then show inbox
	
	