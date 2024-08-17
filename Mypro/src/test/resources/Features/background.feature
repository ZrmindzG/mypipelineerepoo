Feature: login page to the sourcedemo page
Scenario Outline: check login is successful with valid credentilas

Given User is on login page
When User enters valid <username> and <password>
And Clicks on login Button
Then User is navigate to Home page
And Close the browser

Examples: 
|username|password|
|standard_user1|secret_sauce1|
|standard_user2|secret_sauce2|
|standard_user3|secret_sauce3|
|standard_user|secret_sauce|
         
         