
Feature: Table Practice
  

	@table
  Scenario: Grab the all Values of col 4 and add 
   Given User should be on the practice page
    When User grabs all the values of Amount section
   Then Add all values in one variable
    And check result on webpage is same as of value in variable

  