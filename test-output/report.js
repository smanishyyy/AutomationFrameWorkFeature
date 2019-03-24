$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/tagging.feature");
formatter.feature({
  "line": 1,
  "name": "test facbook home page funtionalaity",
  "description": "",
  "id": "test-facbook-home-page-funtionalaity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "ValidationOfStaticCharacterWise",
  "description": "",
  "id": "test-facbook-home-page-funtionalaity;validationofstaticcharacterwise",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoketest"
    },
    {
      "line": 8,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Launch the facebook url22",
  "keyword": "Given "
});
formatter.match({
  "location": "Tc03_Tagging.Launch_the_facebook_url22()"
});
formatter.result({
  "status": "skipped"
});
});