Feature: Login Page Automation

Scenario Outline: Check login is successfull with Valid creds
Given I am on the page URL "https://demoqa.com/"
Then Click on Book Store Application
And Click on Login
When User enters valid "<username>" and "<password>"
And Click on Login Button
Then Click on Logout Button

Examples:
| username | password |
|Suraj|Suraj@1100|


