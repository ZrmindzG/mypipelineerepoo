Feature: home page to the checkout page

Background: 
Given User is on login page
When User enters valid username and password
And Clicks on login Button
Then User is navigate to Home page
And Close the browser


Scenario: Verify the good(sauce labs bike light) successfully shipped
Given User is in the dashboard page
When User click on add button of the product(sauce bike light) 
And User Click on the cart icon
And User navigate to the cart page
Then User able to see the product(sauce bike light) is successfully added
And User click on the checkout button
And User fills all the details of customer
And User click on the continue button
And User click on the finish button
Then User able to see the order is successfully placed
And User able to see the back to home button


Scenario: Verify the product(sauce labs bike light) successfully shipped
Given User is in the dashboard page
When User click on add button of the product(sauce bike light) 
And User Click on the cart icon
And User navigate to the cart page
Then User able to see the product(sauce bike light) is successfully added
And User click on the checkout button
And User fills all the details of customer
And User click on the continue button
And User click on the finish button
Then User able to see the order is successfully placed
And User able to see the back to home button


Scenario: Verify the gold(sauce labs bike light) successfully shipped
Given User is in the dashboard page
When User click on add button of the product(sauce bike light) 
And User Click on the cart icon
And User navigate to the cart page
Then User able to see the product(sauce bike light) is successfully added
And User click on the checkout button
And User fills all the details of customer
And User click on the continue button
And User click on the finish button
Then User able to see the order is successfully placed
And User able to see the back to home button






