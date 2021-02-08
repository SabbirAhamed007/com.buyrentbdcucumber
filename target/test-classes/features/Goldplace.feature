Feature: Test BDDL Gold Place feature
  

  @smoke
  Scenario: Test BDDL Gold Place scenario
    Given I open buyrentbd website for test
    When I click on BDDL Gold flat
    And I click on the next
    And verift text
    Then I close it