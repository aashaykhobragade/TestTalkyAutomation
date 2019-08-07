$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("talky.feature");
formatter.feature({
  "line": 2,
  "name": "talky.io validations",
  "description": "",
  "id": "talky.io-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "talky.io test Scenario",
  "description": "",
  "id": "talky.io-validations;talky.io-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on talky page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks Start a Chat",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Allow camera access",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Allow microphone access",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks join the call",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_on_cleartip_page()"
});
formatter.result({
  "duration": 7612992488,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_Start_a_Chat()"
});
formatter.result({
  "duration": 773436341,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "stepdefination.user_allow_microphone_access()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});