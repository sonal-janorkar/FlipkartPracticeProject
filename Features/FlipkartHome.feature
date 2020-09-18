Feature: OPPO Mobiles
#Background: User is on Login Page

Scenario Outline: User can see oppo mobiles 
Given User is already login with credentials "<Username>" and "<Password>"
When  User click on Oppo mobile 
Then User is able to Only oppo phones
Examples:
|Username||Password|
|9011726060||Sonal@28|
