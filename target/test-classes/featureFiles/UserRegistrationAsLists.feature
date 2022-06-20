Feature: User registration

Scenario: User Registration as Lists
  Given User navigates to Registartion page
  When User enter below user details
   | Tarkeshwar | Singh | test1@test.com | IT |
   | Sweta | Singh | test1@test.com | IT |
   | Vivaan | Singh | test1@test.com | Student |
  Then user is successfully registered