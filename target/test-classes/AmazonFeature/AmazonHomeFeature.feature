Feature: Amazon Home Page
Scenario: User Looking For A Product
Given user Launches The Web Application

Scenario: User Searching For A Product
When user Select Required Category Tab
And user Select A Product
Then it Navigates To Product Page

Scenario: User Looking For Product Details
When user Select the Features
And user Select The Add To Cart
Then user Click The Cart Option Navigates to Cart Page