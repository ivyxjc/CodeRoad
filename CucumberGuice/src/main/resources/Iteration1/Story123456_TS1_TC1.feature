Feature:

  Scenario Outline: 固定金额取款
    Given My account has balance "<accountBalance>"元
    When Withdraw Amount "<withdrawAmount>"元
    Then I get cash "<receivedAmount>"元
    And My balance is "<remainingBalance>"元
    Examples:
      | accountBalance | withdrawAmount | receivedAmount | remainingBalance |
      | 1000.00        | 100.00         | 100.00         | 900.00           |
      | 500.00         | 500.00         | 500.00         | 0.00             |