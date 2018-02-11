Feature:

  Scenario Outline: Calculator
    Given two numbers "<num1>" and "<num2>"
    When the calculator is running
    Then the output is "<sum>"

  @positive
    Examples:
      | num1 | num2 | sum  |
      | 100  | 100  | 200  |
      | 556  | 520  | 1076 |

  @negative
    Examples:
      | num1 | num2 | sum  |
      | 1000 | 100  | 1100 |
      | 500  | 500  | 900  |
