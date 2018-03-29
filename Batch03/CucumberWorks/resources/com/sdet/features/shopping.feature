
@Shopping 

Feature: checking out the filled cart 

# background will execute each time for each scenario
# the background will be treated likfe before in junit only for 
# the current feature file 
Background: 
	Given the path is set 
	And the browser is loaded 

Scenario Outline: 

	Given the user is "<loginstatus>"
	When the user selects products 
	Then adds the products to cart 
	And Pays the amount through "<paymentmode>" 

Examples: 
	| loginstatus | paymentmode| 
	| loggedin    | debitcard  | 
	| loggedin    | credicard  | 
  | loggedin    | paypal     | 
	| loggedin    | cod        | 
  | notlogged   | debitcard  | 
	| notlogged   | cod        | 
