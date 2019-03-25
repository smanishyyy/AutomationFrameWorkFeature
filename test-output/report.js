$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify the all static text and element of facebook page",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Validation of static text and elemet of facebook page",
  "description": "",
  "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Launch the facebook url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify if all the elemnet and text is presrnt on the login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.before()"
});
formatter.result({
  "duration": 24620556809,
  "status": "passed"
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.main()"
});
formatter.result({
  "duration": 24627426270,
  "status": "passed"
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.after()"
});
formatter.result({
  "duration": 1454953376,
  "status": "passed"
});
formatter.after({
  "duration": 169342,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "ValidationOfStaticCharacterWise",
  "description": "",
  "id": "login-feature;validationofstaticcharacterwise",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Launch the facebook url2",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "check if disclaimer birthday and bottom text element is available",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Pass the input text of disclaimer",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify if disclaimer text on application is same as passed in input",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Pass the input text of birthday",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify if birthday text on application is same as passed in input",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pass the input text of bottom text",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify if bottom text on application is same as passed in input",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browserr",
  "keyword": "And "
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.before()"
});
formatter.result({
  "duration": 16485759895,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.main()"
});
formatter.result({
  "duration": 20339471260,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Pass__input_text_disclaimer()"
});
formatter.result({
  "duration": 20084534,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Verify_disclaimer_text()"
});
formatter.result({
  "duration": 10451393349,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Pass__input_text_birthday()"
});
formatter.result({
  "duration": 45757,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Verify_birthday_text()"
});
formatter.result({
  "duration": 10046462082,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Pass__input_text_bottom()"
});
formatter.result({
  "duration": 78256,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Verify_bbottom_text()"
});
formatter.result({
  "duration": 10053472661,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.after()"
});
formatter.result({
  "duration": 3064942574,
  "status": "passed"
});
formatter.after({
  "duration": 104342,
  "status": "passed"
});
});