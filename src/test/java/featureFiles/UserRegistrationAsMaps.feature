Feature: User registration as Maps

Scenario: User Registration as Maps
  Given User navigates to Registartion page As Maps
  When User enter below user details as columns
   | Firstname | Lastname | Email | Profession |
   | Tarkeshwar | Singh | test1@test.com | IT |
   | Sweta | Singh | test1@test.com | IT |
   | Vivaan | Singh | test1@test.com | Student |
  Then user is successfully registered as Maps