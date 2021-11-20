Feature: Add a gift card to cart
Scenario: Gift card to the cart
Given The user is on landing page
When The user clicks on gift card icon
And increases the quantity, adds to cart
And closes the pop up, clicks on my cart
Then The item has to be added to the cart