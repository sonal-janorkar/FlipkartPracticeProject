Feature: User Login 
Background: User is on Login Page
Given User is on Login Page
Scenario Outline: User is able to login with correct credentials
When  User enters correct "<Username>" and "<Password>" and User click on submit 
Then Username is visible on Home page
Examples:
|Username||Password|
|9011726060||Sonal@28|



Scenario Outline: User gets error message for incorrect Username
When  User enters incorrect "<Email>" and correct "<Pass>" and User click on submit 
Then User gets error message
Examples:
|Email||Pass|
|abcd||Sonal@28|




