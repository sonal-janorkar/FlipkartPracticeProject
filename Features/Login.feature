
Feature: User Login 

Scenario Outline: User is able to login with correct credentials
Given User is on Login Page
When  User enters correct "<Username>" and "<Password>" and User click on submit 
Then Username is visible on Home page
Examples:
|Username||Password|
|9011726060||Sonal@28|
|9011726060||Sonal@28|


Scenario Outline: User gets error message for incorrect Username
Given User is on Login Page
When  User enters incorrect "<Email>" and correct "<Pass>" and User click on submit 
Then User gets error message
Examples:
|Email||Pass|
|9011726061||Sonal@28|
|abcd||Sonal@28|


