Feature: Add the product on the second page of the shop by category to wish list
Scenario: Shop By category page navigation
Given The user clicks on jewels under Shop by category
When The user navigates to the secong page
And The user selects a product from that page, adds it to wishlist
Then The item has to be added to wishlist