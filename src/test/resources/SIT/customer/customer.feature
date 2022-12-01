Feature: This is a feature

  Scenario: test scenario number one
    Given Giving me a stick
    When  I jump out of the earth
    Then I got it


  Scenario Outline: The second outline test scenario
    Given I make <Va1>
    When I build <Var2>
    Then I recieved <Va3>

    Examples:
      | Va1 | Var2 | Va3 |
      | k1  | k2   | 3   |
      | k1  | k2   | 4   |
      | k1  | k2   | 5   |
      | k1  | k2   | 6   |
      | k1  | k2   | 7   |
