$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/SecondScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Second TestCase Scenario",
  "description": "",
  "id": "second-testcase-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Second TestCase Scenario",
  "description": "",
  "id": "second-testcase-scenario;second-testcase-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verifyAll Details",
  "keyword": "Then "
});
formatter.match({
  "location": "SecondScenarioStepDefinition.user_login()"
});
formatter.result({
  "duration": 166691300,
  "status": "passed"
});
formatter.match({
  "location": "SecondScenarioStepDefinition.title_of_the_page()"
});
formatter.result({
  "duration": 70100,
  "status": "passed"
});
formatter.match({
  "location": "SecondScenarioStepDefinition.enter_credentials()"
});
formatter.result({
  "duration": 56800,
  "status": "passed"
});
formatter.match({
  "location": "SecondScenarioStepDefinition.verifyAll_Details()"
});
formatter.result({
  "duration": 55900,
  "status": "passed"
});
});