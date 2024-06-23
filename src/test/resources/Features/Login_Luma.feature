
Feature: Login to Luma E-Commerce Website
@ignore
  Scenario: Verify the login functionality of the website
    Given Navigate to the URL
    When Click on the Sign in link
    And Enter the Username and Password in the field
    Then Click on the Sign in button
    And Validate the login 
