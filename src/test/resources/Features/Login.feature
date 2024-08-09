Feature: Login Page Automation

Scenario: Check login is successfull with Valid creds
Given User is on login page
When User enters valid username and password
When Click on Login Button
Then User is navigated to Home Page
Then Close the browser

