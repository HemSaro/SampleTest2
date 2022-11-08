Feature: Login page testing
@UserOne_asList
Scenario: Validate the valid username and password
Given Enter the URL
When Enter the User
|Aiite1|
|Aiite2|
|Aiite3|
And Enter the password "1234"
And Click the login button
Then Validate the Home page title

@UserOne_asLists
Scenario: Validate the valid username and password
#Given Enter the URL
When Enter the User for asList
|Aiite1|A|
|Aiite2|B|
|Aiite3|C|

@UserOne_asMap
Scenario: Validate the valid username and password
Given Enter the URL
When Enter the User for asMap
|firstname|Hema|
|lastname|Latha|

@UserOne_asMaps
Scenario: Validate the valid username and password
Given Enter the URL
When Enter the User for asMaps
|firstname|lastname|
|Hema|Latha|
|Saravana|Kumar|


