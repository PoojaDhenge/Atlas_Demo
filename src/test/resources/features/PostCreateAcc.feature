@APITest
Feature: Create bank_account
  

  @demo
  Scenario: Create account
     Given Post Api_url 
     Then get id_token
    Then set Headers
    Then hit Api_url
    And Get Api_response