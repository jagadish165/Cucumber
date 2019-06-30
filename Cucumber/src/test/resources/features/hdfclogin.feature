Feature: Users must be able to login to hdfc application.
@temp
  Scenario: Open hdfc application and login.
    Given I have opened "https://netbanking.hdfcbank.com/netbanking/"
    When I enter username as "503533"
    And Password as "Stergfg"
    And check login image
    And Click on Login
    Then I should successfully login to application
