@Login
Feature: To Test Login Application 

Background: 
		Given load chrome driver 
		And get login page factory 
Scenario Outline: 
	Given the user name as "<username>"
	And the password as "<password>" 
	When the user click on submit button 
	Then validate user credentials 
	And close chrome browser

Examples: 
|username|password|
|sarika|sarika@123|
|ruth|ruth@321|
|hareesh|hareesh@123|