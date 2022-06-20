Feature: Login Test

Scenario Outline: Login for multiple users
  Given User navigates to Login page
  When User enters "<Username>" and "<Password>"
  
  Then User logs in to the application
  
Examples: 
  | Username | Password | 
  | User1 | Password1 |
  | User2 | Password2 |
  | User3 | Password3 |