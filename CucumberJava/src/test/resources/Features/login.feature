Feature: feature to test login functionality

  Scenario: check logo presence on login is success
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And close browser

  