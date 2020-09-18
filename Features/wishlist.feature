Feature: Wishlist Oppo mobile

Background: User in ON Oppo Mobile Page
Given Product is available
Scenario: Add to wishlist
When User clicks on heart icon
Then Product is added to wishlist


Scenario Outline: Verify Delievery is avialbale for pin code
When User enters "<Pincode>"
Then verify pincode is servicable and delivery is free
Examples:
|Pincode|
|411057|


