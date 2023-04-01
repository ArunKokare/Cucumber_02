Feature: Buy Feature

Scenario: Verify user is able to buy product 

Given user is on homepage 
When user mouse hover on Men and Top and Jackets and click here 
And click on any of the product 
And select/ click on colour and size 
And click on add to cart 
And Click on cart button 
And click on proceed to checkout
And enter all details of customer 
And Click on shipping method
And click on next 
And click on place order
Then user is able to place order and it shows "Thank you"