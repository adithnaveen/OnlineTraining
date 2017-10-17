# this is my comment 
# Feature for maturity of the policy 
@Smoke @Sanity
Feature: Maturity of the policy 

Scenario: 
	Given The policy is issued 
	When Policy attains maturity of twenty years 
	Then Pay policy amount of 20000
	And Receive policy documents 


Scenario: 
	Given The policy is issued 
	When Policy attains maturity of thirty years 
	Then Pay policy amount of 25000
	And Receive policy documents 