Feature: Test Dreamway feature
  

  @smoke
  Scenario: Test Dreamway apartment scenario
    Given I open buyrentbd website for Dreamway
    And I click on number two links for Dreamway
    When I click on Dreamway flat
    And I click on next buttons for Dreamway
    And verift the text on the page Dreamway
    Then I close browser for Dreamway