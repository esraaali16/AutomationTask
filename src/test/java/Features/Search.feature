Feature: Search Functionality

  Scenario: user can perform search on Google
    Given user open Google homepage
    When user enter "test automation" in search textbox
    And click on search button
    Then search result page should contain relevant results