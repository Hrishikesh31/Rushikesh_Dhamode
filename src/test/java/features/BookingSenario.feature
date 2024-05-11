Feature: Booking Senario
  I want to use this template for my feature file

  @BookingonAAI
  Scenario: End to End Booking Flow
    Given User should be on AirIndiaExpress website
    And Select Source and Destination
    And Select perticular date
    When User clicks on next button
    And Select the Flight with minimun price and continue
    And Select basic plan in popup
    Then Fill the Guest Details
    And Select Some addons
    And Select 7F Seat
    And Continue to Payment Page
    And Add Fake Credit Card Details
    Then Check weather payment gets confirmed or not
