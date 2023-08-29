Feature: F02_login | users could use login functionality to use their accounts
  @happyLogin
  Scenario: user could login with valid email and password
    Given user redirect to login page
    And user login with valid data "test1@example.com"  "P@ssw0rd"
    And user click on login button
    Then user login to the system successfully

   @sadLogin
    Scenario: users could login with invalid email and password
      Given user redirect to login page
      And user login with invalid data "wrong@example.com"  "P@ssw0rd"
      And user click on login button
      Then user could not login to the system