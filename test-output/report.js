$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify the all static text and element of facebook page",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validation of static text and elemet of facebook page",
  "description": "",
  "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch the facebook url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify if all the elemnet and text is presrnt on the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.before()"
});
