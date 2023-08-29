Feature: F03_currencies
  @selectCurrency
  Scenario: select Euro currency from the dropdown list on the top left of home page
    Given user select Euro currency
    Then Euro Symbol is shown on the products displayed in Home page