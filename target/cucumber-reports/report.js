$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "some other precondition",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 4069040014,
  "status": "passed"
});
formatter.match({
  "location": "Steps.some_other_precondition()"
});
formatter.result({
  "duration": 53193,
  "status": "passed"
});
});