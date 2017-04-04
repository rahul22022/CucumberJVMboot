Feature: Calculator

  Scenario Template:
    Given calculator is implemented
    When we pass <num1> and <num2> to the calculator
    Then sum is displayed as <sum>

    Examples:
    |num1|num2|sum|
    |1   |2   |3  |
    |100 |120 |220|
    |0   |0   |0  |
    | a   | v   |p   |
    |1    |1    |0   |



