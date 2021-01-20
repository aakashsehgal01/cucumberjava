@SmokeScenario
Feature: test login

@smoketest
Scenario: Check login is successful with valid credentials
Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to home page

#commenting below
#Scenario Outline: Check login is successful with valid credentials
#Given user is on login page
#When user enters "username" and "password"
#And clicks on login button
#Then user is navigated to home page

#Examples:
#|username|password|
#|user1|abc|
#|user2|abc2|