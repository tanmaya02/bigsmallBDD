Feature: Check the name of the least priced product in gifts page
Scenario: Name and price of the least priced product
Given The user is on home
When The user clicks on DIY gift under gifts dropdown
And sorts the products from low to high
Then product details are displayed