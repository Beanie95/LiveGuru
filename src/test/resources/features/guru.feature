Feature: Live Guru Frontend

  Background:
    Given Open LiveGuru99 site

  Scenario Outline: Register success to system
    When Click on ACCOUNT menu
    And Choose Register link
    And Input "<firstname>","<lastname>","<email>","<password>","<repassword>" to form
    Then Click REGISTER button
    And Verify text displayed after registerd
#  Case02: Verify user information is correct after registered successfully
    And Open my account page "<email>" and "<password>"
    And Open ACCOUNT INFORMATION page
    Then Verify data in firstname, lastname and email are correctly

    Examples:
      | firstname | lastname | email                | password | repassword |
      | Guru12    | demo12   | livedemo12@gmail.com | 111222   | 111222     |





