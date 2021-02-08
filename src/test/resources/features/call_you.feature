Feature: Test call you feature

  @smoke
  Scenario: Test Let Us Call you scenario
    Given I open buyrentbd website
    When I enter name on let us call you form
    And email
    And phone number
    Then I enter message
    And close the browser
