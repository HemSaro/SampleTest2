@User
Feature: Login Page testing
Background:
Given Enter the URL

	@UserOne
  Scenario: Validate the valid username and password
    Given Enter the URL
    When Enter the Username "HemaSaro"
    And Enter the password "Hema@2306"
    And Click the login button
    Then Validate the Home page title
    
    @Usertwo 
    Scenario: Validate the invalid username and password
    Given Enter the URL
    When Enter the Username "qwert"
    And Enter the password "0987645"
    And Click the login button
    Then Validate the Home page title
    
@scenariooutline
  Scenario Outline: Validate the invalid username and valid password
	When Enter the user "<username1>"
	And Enter the pass "<password1>"
	And Click the login button
	Then Validate the Home page title
	Examples:
	|username1|password1|
	|Aiite1|abcd123|
	|Aiite2|abgt123|