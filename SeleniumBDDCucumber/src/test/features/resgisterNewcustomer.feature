Feature: Register New Customer

@test
  Scenario: Register a new customer for New Tours website
    Given I Navigate to New Tours website
    And Click on 'REGISTER' link
    When I complete all the form details
    And I click on 'Submit' button
    Then I am navigated to the confirmation page
