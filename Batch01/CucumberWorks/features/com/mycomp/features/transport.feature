@MyTag 

Feature: 
	to reach the office at right time using vehicle 
Scenario: 
	Given ive to reach office at 10 in morning 
	When i take out vehicle
	| vehicle | how      | capacity |
	| bike    | drive    |  full    | 	
	| car     | drive    |  half    |
	| chopper | flying   |  full    | 
	| aeroplane | flying |  full    |   
	Then i may reach the office at correct time 
