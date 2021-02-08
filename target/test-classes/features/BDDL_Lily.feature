Feature: Test Lily feature

  @smoke
  Scenario: Test Lily apartment scenario
    Given I open buyrentbd website for Lily
    And I click on number two links
    When I click on Lily flat
    And I click on next buttons for Lily
    And verift the text on the page Lily
    Then I close browser for Lily
