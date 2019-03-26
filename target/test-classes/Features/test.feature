Feature: Login Feature
  Verify the all static text and element of facebook page



 Scenario Outline: Validation of static text and elemet of facebook page
Given Launch the facebook url "<url>" and "<log>"
 When Verify if all the elemnet and text is presrnt on the login page
 Then close the browser
   
     Examples:
     
     |url|log|
     |https://www.facebook.com|D://Workspace//AutomationDemoMaven//LOG4J.XML|
     |https://www.facebook.com|D://Workspace//AutomationDemoMaven//LOG4J.XML|
     
   
  Scenario:  ValidationOfStaticCharacterWise
    Given Launch the facebook url2 "https://www.facebook.com" and "D://Workspace//AutomationDemoMaven//LOG4J.XML"
    When check if disclaimer birthday and bottom text element is available
    And Pass the input text of disclaimer
    Then verify if disclaimer text on application is same as passed in input
   And Pass the input text of birthday
   Then verify if birthday text on application is same as passed in input
   And Pass the input text of bottom text
   Then verify if bottom text on application is same as passed in input
   And close the browserr
   
 
   