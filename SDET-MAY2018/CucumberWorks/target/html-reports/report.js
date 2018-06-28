$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "login to web application",
  "description": "",
  "id": "login-to-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "login-to-web-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user given valid user name and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "krishna",
        "secet"
      ],
      "line": 9
    },
    {
      "cells": [
        "ravi",
        "hello123"
      ],
      "line": 10
    },
    {
      "cells": [
        "adithya",
        "testing111"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "take user to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_browser_is_open()"
});
formatter.result({
  "duration": 776665344,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_given_valid_user_name_and_password(DataTable)"
});
formatter.result({
  "duration": 27889242,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.take_user_to_home_page()"
});
formatter.result({
  "duration": 13517134,
  "status": "passed"
});
});