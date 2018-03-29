$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login form feature",
  "description": "",
  "id": "login-form-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 8848116165,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "",
  "description": "",
  "id": "login-form-feature;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "redirec to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_username_and_password()"
});
formatter.result({
  "duration": 967806783,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_submit()"
});
formatter.result({
  "duration": 487863595,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.redirec_to_home_page()"
});
formatter.result({
  "duration": 161231,
  "status": "passed"
});
});