Feature: Users must be able to logout to hdfc application.
 @temp
  Scenario: Verify account balance and logout.
    Given I logged into "https://netbanking.hdfcbank.com/netbanking/"
    When I click on account information
    Then Account balance should display
    When I click on logout
    Then logout should be successful
