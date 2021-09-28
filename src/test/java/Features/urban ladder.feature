Feature: Urban Ladder 

Scenario: Display location of store
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user clicks stores in home page
Then user should navigate to stores page 
And display location
Then close browser

Scenario: validate customer stories
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user clicks view all customer stories
Then user should navigate to customer stories page
Then close browser

Scenario: validate home decor
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user clicks Decor button
Then user should navigate to home decor page
Then close browser

Scenario: validate Gift Card
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user clicks gift card button
Then user should navigate to gift card page
Then close browser

Scenario: validate help
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user clicks help button
Then user should navigate to help page
Then close browser


Scenario: AddToCart
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user searches "Sofa" in search box
Then clicks the product
When user clicks addTocart button 
Then product added to cart
Then close browser


Scenario Outline: search products
Given user is opening the browser and landed on correct "https://www.urbanladder.com/"
When user enters "<product name>" in search box
Then user should navigate to another page
Then close browser



Examples:
|product name  |
|Table         |
|Sofa          |
|Chair         |
|Dining        |

