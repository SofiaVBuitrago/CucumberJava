Feature: google search bar
  @Search
  Scenario: user search by typing something on the search bar and pressing Enter
    Given browser is open
    And user is on google search page
    When user types on the search bar
    And press Enter key
    Then the user is sent to search results
