Feature: F01_Register | users could register with new accounts
  @register
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    And user select gender type
    And user enter first name
    And user enter last name
    And user enter date of birth
    And user enter email
    When user enter password
    And user confirm password
    Then user click on Register button
    Then success message is displayed