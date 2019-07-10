@tag
Feature: To add the tariff plan

  @tag1
  Scenario: To add the tariff plan
    Given The user should be in telecom page
    And The user shoukd click the add tariff plan
    When The user should provide valide details
      | rent | lmin | imin | smspack | mincharge | intercharges | smscharges |
      | 1000 |   60 |  120 |      36 |        50 |           80 |         40 | 
      | 2000 |   40 |  150 |      46 |        10 |          100 |        140 |
      | 3000 |   80 |  300 |      56 |        20 |          120 |        250 |
    Then the user should validate the customer id
