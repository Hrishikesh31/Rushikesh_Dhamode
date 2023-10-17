Feature: Product Search

@searchBySearchField
Scenario: Access a Product via Search

Given User is on ebay.com page
When User Search using search bar
And clicks on search
Then page loads completely
And Verify result
