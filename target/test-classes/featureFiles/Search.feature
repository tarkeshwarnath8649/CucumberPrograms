@All
Feature: Amazon Search

@Smoke
Scenario: Search for BAT
Given Amazon search page is loaded
When User enters Product name ="Bat" and price = 1000
Then Search result is displayed 
Then Test is passed

@Regression
Scenario: Search for Clothings
Given Amazon search page is loaded
When User enters Product name ="Shirt" and price = 2000
Then Search result is displayed 
Then Test is passed

@Smoke @Regression
Scenario: Search for Cosmetics
Given Amazon search page is loaded
When User enters Product name ="Sunscreen" and price = 3000
Then Search result is displayed 
Then Test is passed

@Prod
Scenario: Search for Cosmetics
Given Amazon search page is loaded
When User enters Product name ="Sunscreen" and price = 3000
Then Search result is displayed 
Then Test is passed