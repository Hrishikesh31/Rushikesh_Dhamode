Feature: Ecart track feature
  I want to track the status of my product delivery

  @tag1
  Scenario: Track
    Given User should be on ecart tracking page
    When User insert MYSP1009831460
    And Clicks on search button
    Then Check weather MYSP1009831460 available on the page