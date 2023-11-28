@HealthCare
Feature: Booking Appointment FOR CURA Healthcare Services

  @TC1003
  Scenario: Booking Appointment by Seoul CURA Healthcare Center
    Given user launches the browser
    Then assert that "CURA Healthcare Service" is displayed
    When user click on "Make Appointment" textbox
    Then assert that "Login" is displayed
    When user enters "John Doe" into field "username"
    And user enters "ThisIsNotAPassword" into field "password"
    And user clicks on login Button
    Then assert that "Make Appointment" is displayed
    When user selects "Seoul CURA Healthcare Center" from "facility" dropdown
    And user click on "Apply for hospital readmission" checkbox
    And user clicks on "None" radio button
    And I enter the date "{{today}}" in the date field "visit_date"
    And user enters "Test Appointment Booking" into field "comment"
    And user click on "Book Appointment" textbox
    Then assert that "Seoul CURA Healthcare Center" is displayed
    And assert that "Appointment Confirmation" is displayed
    And assert that "Yes" is displayed
    And assert that "None" is displayed
    And assert that "Test Appointment Booking" is displayed
