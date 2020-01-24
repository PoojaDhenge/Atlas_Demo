@APITest
Feature: Generate Token
  

  @demo
  Scenario: Generate id_token
     Given Post api_url 
    When Enter name and password
  Then Post the api_url
  
  
    
    
   Scenario: Create bank_acc
  
    When enter id_token and set header
    
    
    Scenario: Get bank details of id
    
    Then get details of id