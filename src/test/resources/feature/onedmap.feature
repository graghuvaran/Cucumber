@tag
Feature: To Add new customer

  @tag1
  Scenario: Generating customer id
    Given The user should be in telecom homepage
    And The user should click add customer
    When The user provide valid details
      | fname   | Raj           |
      | lname   | kumar         |
      | email   | abc@gmail.com |
      | Address | chennai       |
      | phoneno |        123456 |
    Then user should validate customer id
