Feature: Login Feature
  Verify the all static text and element of facebook page



 Scenario: Validation of static text and elemet of facebook page
Given Launch the facebook url
 When Verify if all the elemnet and text is presrnt on the login page
 Then close the browser
   
   Scenario: ValidationOfStaticCharacterWise
    Given Launch the facebook url2
    When check if disclaimer birthday and bottom text element is available
    And Pass the input text of disclaimer
    Then verify if disclaimer text on application is same as passed in input
   And Pass the input text of birthday
   Then verify if birthday text on application is same as passed in input
   And Pass the input text of bottom text
   Then verify if bottom text on application is same as passed in input
   And close the browserr