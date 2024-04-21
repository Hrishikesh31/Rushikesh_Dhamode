Feature: Searching Elements

@searchByCategory
Scenario: Access a Product via category after applying multiple filters

Given User is on ebay.com page
When User Navigate to search by category
And Select Cell Phones & Smartphones
Then Click on All Filters
And Apply three filters
And Verify that the filter applied 

@footerLinks
Scenario: Footer links access

Given User is on ebay.com page
When User navigate to the footer links
Then Click on all the links 
And Open it in new tabs
And Grab the title of each page