# This feature is to show working of tags in cucumber 
@Sanity @Somke

Feature: Login for web application 

Scenario: 
	Given username and password
	| username | password | 
	| aswini | sridhar | 
	| rahda | halebidu | 
	| naveen | kumar |
	| kanchan | secret | 
	When the credentials are validated 
	Then redirect the appliction to home page 
