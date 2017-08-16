$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "login-feature;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "username and password",
  "rows": [
    {
      "comments": [
        {
          "line": 6,
          "value": "# there shall be values which can be passed"
        }
      ],
      "cells": [
        "login",
        "pwd",
        "roles"
      ],
      "line": 7
    },
    {
      "cells": [
        "larry",
        "larrypwd",
        "manger"
      ],
      "line": 8
    },
    {
      "cells": [
        "harry",
        "harrypwd",
        "teamleader"
      ],
      "line": 9
    },
    {
      "cells": [
        "peter",
        "peterpwd",
        "developer"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "login successful",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.username_and_password(LoginBean\u003e)"
});
formatter.result({
  "duration": 431499133,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.login_successful()"
});
formatter.result({
  "duration": 30769,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 29538,
  "status": "passed"
});
});