Feature: Free CRM Login feature

	@SmokeTest @RegressionTest
	Scenario: Free CRM Test Scenario
		Given User is already on login page
		When title of login page is free crm
		Then user clicks on login Button
		Then user is on home page of login
		Then user enters username and password
		|username|password|
		|smiley6sharu@gmail.com|Ganesharany@6|
		Then user need to logout
		