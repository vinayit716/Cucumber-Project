Feature: Login fuctionality
Scenario: verify the login credentials
Given user is on login page
When user enter the username and password
And user click the login button
Then user getting error message

Scenario: verify the login invalid credentials
Given user is on login page
When user enter the username and password
And user click the login button
Then user getting error message


