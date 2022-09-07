Feature: Live Guru Frontend

  Background:
    Given Open LiveGuru99 site


  Scenario: Register success to system
    When Open LiveGuru99 site
    And Click on ACCOUNT menu
    And Choose Register link
    And Input firstname: "Guru",lastname: "demo",email: "livedemo@gmail.com",password: "111222",re-password: "111222" to form
    Then Click REGISTER button


  Scenario: Try While loop
    And Select Input form submit
    Then Enter email "aa"
    Then Verify email no longer error
    And Enter phone number "03"
    Then Enter "a" into Project Description
    Then Verify Project Description no longer error



