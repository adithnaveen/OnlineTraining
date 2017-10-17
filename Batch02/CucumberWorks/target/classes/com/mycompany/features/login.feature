@Login
Feature: login to web application 


# Before in junit
Background: 
	Given the path is set

Scenario Outline: 
	Given the browser is "<browser_status>"
	When username is "<entering_status>"
	Then validate user credentials 

Examples: 
	| browser_status	| entering_status   |
	|   open 					| entered						|
	|		open					| enterednumbers		| 
	|		notopen       | entered						|
	|   notopen				| enteredsplchars		|
	|   notopen				| notentered				|