Feature: Check the COD availability of the DC Merchandise product
Scenario: COD availability 
Given The user is home page
When The user clicks on DC merchandise under the Official Merchandise dropdown
And The user clicks on the product, enters the pincode and clicks on check
Then system should display whether cod is available or not