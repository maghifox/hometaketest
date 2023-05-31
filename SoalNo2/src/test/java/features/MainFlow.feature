Feature: Main Flow

Scenario: I want to go through the main flow
Given I Open Chrome Browser and navigate to the url
When I put the provided credentials as a standard user into the fields
And I click the Login button
And I click one of the products
And I add the product to the cart
And I go to the cart page
And I verify the product price and click the checkout button
And I fill the information needed
And I click the continue button
And I click the finish button
Then I can see the checkout is completed