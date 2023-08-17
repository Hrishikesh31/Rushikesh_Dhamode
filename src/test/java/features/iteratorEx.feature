

Feature: Iterator_Example

@Sanity
Scenario: Iterate through all the footer links
Given User is on Vikamshi landing page
When User goes to footer section
Then Click on all footer links 
Then Grab all pages title