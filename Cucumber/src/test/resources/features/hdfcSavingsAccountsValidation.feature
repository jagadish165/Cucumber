Feature: Verify savings products

  @now
  Scenario Outline: Navigate to savings product page and verify 11 products
    Given user navigate to "https://www.hdfcbank.com/"
    And MouseHover on Products
    And MouseHover on Account & Deposits
    And Click on Savings Account
    Then '<Savings>' savings accounts should display
    Then Close browser

    Examples: 
      | Savings                 |
  #    | SavingsMax Account      |
      | Senior Citizen Account  |
      | Regular Savings Account |
