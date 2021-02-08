Feature: Test BDDL Sufia feature
  
  @smoke
  Scenario: Test BDDL Sufia scenario
    Given I open buyrentbd website for Sufia
    And I click on number two
    When I click on Sufia flat
    And I click on next buttons for Sufia
    And verift the text on the page Sufia
    Then I close browser for Sufia