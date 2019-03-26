$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify the all static text and element of facebook page",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validation of static text and elemet of facebook page",
  "description": "",
  "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Launch the facebook url \"\u003curl\u003e\" and \"\u003clog\u003e\"",
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
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page;",
  "rows": [
    {
      "cells": [
        "url",
        "log"
      ],
      "line": 13,
      "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page;;1"
    },
    {
      "cells": [
        "https://www.facebook.com",
        "D://Workspace//AutomationDemoMaven//LOG4J.XML"
      ],
      "line": 14,
      "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page;;2"
    },
    {
      "cells": [
        "https://www.facebook.com",
        "D://Workspace//AutomationDemoMaven//LOG4J.XML"
      ],
      "line": 15,
      "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Validation of static text and elemet of facebook page",
  "description": "",
  "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Launch the facebook url \"https://www.facebook.com\" and \"D://Workspace//AutomationDemoMaven//LOG4J.XML\"",
  "matchedColumns": [
    0,
    1
  ],
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
  "arguments": [
    {
      "val": "https://www.facebook.com",
      "offset": 25
    },
    {
      "val": "D://Workspace//AutomationDemoMaven//LOG4J.XML",
      "offset": 56
    }
  ],
  "location": "TC01_FacebookHomePageVerify.before(String,String)"
});
formatter.result({
  "duration": 18674810968,
  "status": "passed"
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.main()"
});
formatter.result({
  "duration": 20274159435,
  "status": "passed"
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.after()"
});
formatter.result({
  "duration": 1814662136,
  "status": "passed"
});
formatter.after({
  "duration": 214668,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validation of static text and elemet of facebook page",
  "description": "",
  "id": "login-feature;validation-of-static-text-and-elemet-of-facebook-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Launch the facebook url \"https://www.facebook.com\" and \"D://Workspace//AutomationDemoMaven//LOG4J.XML\"",
  "matchedColumns": [
    0,
    1
  ],
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
  "arguments": [
    {
      "val": "https://www.facebook.com",
      "offset": 25
    },
    {
      "val": "D://Workspace//AutomationDemoMaven//LOG4J.XML",
      "offset": 56
    }
  ],
  "location": "TC01_FacebookHomePageVerify.before(String,String)"
});
formatter.result({
  "duration": 9755503775,
  "status": "passed"
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.main()"
});
formatter.result({
  "duration": 8526110056,
  "status": "passed"
});
formatter.match({
  "location": "TC01_FacebookHomePageVerify.after()"
});
formatter.result({
  "duration": 1529014499,
  "status": "passed"
});
formatter.after({
  "duration": 115887,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "ValidationOfStaticCharacterWise",
  "description": "",
  "id": "login-feature;validationofstaticcharacterwise",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Launch the facebook url2 \"https://www.facebook.com\" and \"D://Workspace//AutomationDemoMaven//LOG4J.XML\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "check if disclaimer birthday and bottom text element is available",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Pass the input text of disclaimer",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "verify if disclaimer text on application is same as passed in input",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Pass the input text of birthday",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "verify if birthday text on application is same as passed in input",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Pass the input text of bottom text",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "verify if bottom text on application is same as passed in input",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "close the browserr",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.facebook.com",
      "offset": 26
    },
    {
      "val": "D://Workspace//AutomationDemoMaven//LOG4J.XML",
      "offset": 57
    }
  ],
  "location": "TC02_ValidationOfStaticCharacterWise.before(String,String)"
});
formatter.result({
  "duration": 11267083061,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.main()"
});
formatter.result({
  "duration": 20370573525,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Pass__input_text_disclaimer()"
});
formatter.result({
  "duration": 1113113,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Verify_disclaimer_text()"
});
formatter.result({
  "duration": 10211617688,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Pass__input_text_birthday()"
});
formatter.result({
  "duration": 56019,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Verify_birthday_text()"
});
formatter.result({
  "duration": 10100271715,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Pass__input_text_bottom()"
});
formatter.result({
  "duration": 44473,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.Verify_bbottom_text()"
});
formatter.result({
  "duration": 10275947343,
  "status": "passed"
});
formatter.match({
  "location": "TC02_ValidationOfStaticCharacterWise.after()"
});
formatter.result({
  "duration": 2888976030,
  "status": "passed"
});
formatter.after({
  "duration": 92368,
  "status": "passed"
});
});