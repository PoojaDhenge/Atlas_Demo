Feature:Create account
  
 Scenario: login
    Given LAunCh
    Then Enter_userid
    Then Enter_pass
    Then Click_on_login_btn
    
 
  Scenario: home page
     Given Start the application
     Then Click_on create new account
     
     Scenario: Basic Details
     Given start_application
    Then Enter_account name
    Then Enter_site_name
    Then enter_phone number1
    And enter_pan no.
    Then type contact search
    
    