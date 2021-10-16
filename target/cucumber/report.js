$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Final.feature");
formatter.feature({
  "line": 1,
  "name": "Final Exam Cucumber Automation",
  "description": "",
  "id": "final-exam-cucumber-automation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4542509600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Sky Blue Background",
  "description": "",
  "id": "final-exam-cucumber-automation;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.set_SkyBlue_Background()"
});
formatter.result({
  "duration": 131996600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinations.i_click_on_the_button()"
});
formatter.result({
  "duration": 38168800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinations.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 51535300,
  "status": "passed"
});
});