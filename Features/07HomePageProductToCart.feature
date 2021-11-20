Feature: Adding product to cart after adding it to the wish list
Scenario: Add product from home page to cart
Given The user clicks on the logo
When The user clicks on the desired product
And adds to wishlist
And increases the quantity and adds to cart
Then The item is added to the cart