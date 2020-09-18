Feature: User is able to add item into cart
Background: User is on Wishlist page
Given Product is available for "411057"

Scenario: Adding Product to cart
When  User clicks on Add to cart button
Then Product successfully added into cart

Scenario: Remove Product from cart
Given Product is added into cart
When User clicks on remove button
Then Product successfully remove from cart