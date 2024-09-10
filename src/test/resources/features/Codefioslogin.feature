Feature: Codefios login functonality validation

Scenario: user should be able to login with valid credential
Given User is on thr codefios login page
When user enters username as "demo@codefios.com"
When User enters password as "abc123"
When User click on signin button
Then user should land on dashboard page

