Feature: Login Page Automation

Scenario Outline: Check login is successfull with Valid creds
Given I am on the page URL "https://demoqa.com/"
Then Click on Book Store Application
Then Click on Login
When User enters valid "<username>" and "<password>"
When Click on Login Button
Then Click on Login Logout

Examples:
| username | password |
|Suraj|Suraj@1100|


