@google
Feature: Testing google

  @google1
  Scenario: Verify main page
    Given I open url "https://www.google.com"
    Then I verify page is open