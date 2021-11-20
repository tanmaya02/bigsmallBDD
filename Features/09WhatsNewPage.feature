Feature: Adding the best selling product to wish list in the What's new page
Scenario: Add best selling product to wish list
Given The user is on main page
When The user clicks on whats new page
And sorts the product on best selling product
And selects the first product from the list, adds it to wishlist
Then product is to be added to wishlist