$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loan.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Loan Feature"
    }
  ],
  "line": 3,
  "name": "",
  "description": "To Saction loan for customer",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "duration": 380718,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the customer works full time",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "working in govt office",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "credit score is more than 500",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "sanction loan",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "customer has to repay within 20 years",
  "keyword": "But "
});
formatter.match({
  "location": "LoanStep.the_customer_works_full_time()"
});
formatter.result({
  "duration": 342693872,
  "status": "passed"
});
formatter.match({
  "location": "LoanStep.working_in_govt_office()"
});
formatter.result({
  "duration": 102564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 26
    }
  ],
  "location": "LoanStep.credit_score_is_more_than(int)"
});
formatter.result({
  "duration": 4151791,
  "status": "passed"
});
formatter.match({
  "location": "LoanStep.sanction_loan()"
});
formatter.result({
  "duration": 1326768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 29
    }
  ],
  "location": "LoanStep.customer_has_to_repay_within_years(int)"
});
formatter.result({
  "duration": 310153,
  "status": "passed"
});
formatter.after({
  "duration": 281436,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# this feature is for login"
    }
  ],
  "line": 3,
  "name": "Login to web application",
  "description": "",
  "id": "login-to-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 11,
      "value": "# steps"
    }
  ],
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-to-web-application;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "the browser is \"\u003cbrowser_status\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"\u003centering_status\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;",
  "rows": [
    {
      "cells": [
        "browser_status",
        "entering_status"
      ],
      "line": 19,
      "id": "login-to-web-application;;;1"
    },
    {
      "cells": [
        "open",
        "entered"
      ],
      "line": 20,
      "id": "login-to-web-application;;;2"
    },
    {
      "cells": [
        "open",
        "enterednumbers"
      ],
      "line": 21,
      "id": "login-to-web-application;;;3"
    },
    {
      "cells": [
        "open",
        "enteredsplchars"
      ],
      "line": 22,
      "id": "login-to-web-application;;;4"
    },
    {
      "cells": [
        "open",
        "notenerted"
      ],
      "line": 23,
      "id": "login-to-web-application;;;5"
    },
    {
      "cells": [
        "notopen",
        "entered"
      ],
      "line": 24,
      "id": "login-to-web-application;;;6"
    },
    {
      "cells": [
        "notopen",
        "enterednumbers"
      ],
      "line": 25,
      "id": "login-to-web-application;;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 238359,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# hooks are the business logic which runs before each"
    },
    {
      "line": 6,
      "value": "# scenario, and these are local only to the feature"
    },
    {
      "line": 7,
      "value": "# file which is written"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_path_is_set()"
});
formatter.result({
  "duration": 363076,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the browser is \"open\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"entered\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "open",
      "offset": 16
    }
  ],
  "location": "LoginStep.the_browser_is_open(String)"
});
formatter.result({
  "duration": 4473022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "entered",
      "offset": 14
    }
  ],
  "location": "LoginStep.user_name_is_entered(String)"
});
formatter.result({
  "duration": 436513,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 84513,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_credentials()"
});
formatter.result({
  "duration": 213743,
  "status": "passed"
});
formatter.after({
  "duration": 1365332,
  "status": "passed"
});
formatter.before({
  "duration": 675282,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# hooks are the business logic which runs before each"
    },
    {
      "line": 6,
      "value": "# scenario, and these are local only to the feature"
    },
    {
      "line": 7,
      "value": "# file which is written"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_path_is_set()"
});
formatter.result({
  "duration": 253128,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the browser is \"open\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"enterednumbers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "open",
      "offset": 16
    }
  ],
  "location": "LoginStep.the_browser_is_open(String)"
});
formatter.result({
  "duration": 300717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enterednumbers",
      "offset": 14
    }
  ],
  "location": "LoginStep.user_name_is_entered(String)"
});
formatter.result({
  "duration": 264205,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 130461,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_credentials()"
});
formatter.result({
  "duration": 276922,
  "status": "passed"
});
formatter.after({
  "duration": 163692,
  "status": "passed"
});
formatter.before({
  "duration": 209231,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# hooks are the business logic which runs before each"
    },
    {
      "line": 6,
      "value": "# scenario, and these are local only to the feature"
    },
    {
      "line": 7,
      "value": "# file which is written"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_path_is_set()"
});
formatter.result({
  "duration": 234256,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the browser is \"open\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"enteredsplchars\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "open",
      "offset": 16
    }
  ],
  "location": "LoginStep.the_browser_is_open(String)"
});
formatter.result({
  "duration": 129641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enteredsplchars",
      "offset": 14
    }
  ],
  "location": "LoginStep.user_name_is_entered(String)"
});
formatter.result({
  "duration": 143180,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 740923,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_credentials()"
});
formatter.result({
  "duration": 171487,
  "status": "passed"
});
formatter.after({
  "duration": 95179,
  "status": "passed"
});
formatter.before({
  "duration": 82872,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# hooks are the business logic which runs before each"
    },
    {
      "line": 6,
      "value": "# scenario, and these are local only to the feature"
    },
    {
      "line": 7,
      "value": "# file which is written"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_path_is_set()"
});
formatter.result({
  "duration": 116103,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the browser is \"open\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"notenerted\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "open",
      "offset": 16
    }
  ],
  "location": "LoginStep.the_browser_is_open(String)"
});
formatter.result({
  "duration": 5742354,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "notenerted",
      "offset": 14
    }
  ],
  "location": "LoginStep.user_name_is_entered(String)"
});
formatter.result({
  "duration": 256000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 209231,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_credentials()"
});
formatter.result({
  "duration": 221948,
  "status": "passed"
});
formatter.after({
  "duration": 155487,
  "status": "passed"
});
formatter.before({
  "duration": 74257,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# hooks are the business logic which runs before each"
    },
    {
      "line": 6,
      "value": "# scenario, and these are local only to the feature"
    },
    {
      "line": 7,
      "value": "# file which is written"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_path_is_set()"
});
formatter.result({
  "duration": 129230,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the browser is \"notopen\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"entered\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "notopen",
      "offset": 16
    }
  ],
  "location": "LoginStep.the_browser_is_open(String)"
});
formatter.result({
  "duration": 915692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "entered",
      "offset": 14
    }
  ],
  "location": "LoginStep.user_name_is_entered(String)"
});
formatter.result({
  "duration": 263795,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 99282,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_credentials()"
});
formatter.result({
  "duration": 1483896,
  "status": "passed"
});
formatter.after({
  "duration": 56615,
  "status": "passed"
});
formatter.before({
  "duration": 182153,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "# hooks are the business logic which runs before each"
    },
    {
      "line": 6,
      "value": "# scenario, and these are local only to the feature"
    },
    {
      "line": 7,
      "value": "# file which is written"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_path_is_set()"
});
formatter.result({
  "duration": 153846,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login-to-web-application;;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the browser is \"notopen\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user name is \"enterednumbers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "validate the user credentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "notopen",
      "offset": 16
    }
  ],
  "location": "LoginStep.the_browser_is_open(String)"
});
formatter.result({
  "duration": 723692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enterednumbers",
      "offset": 14
    }
  ],
  "location": "LoginStep.user_name_is_entered(String)"
});
formatter.result({
  "duration": 198154,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 70974,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_credentials()"
});
formatter.result({
  "duration": 716718,
  "status": "passed"
});
formatter.after({
  "duration": 178052,
  "status": "passed"
});
formatter.uri("transport.feature");
formatter.feature({
  "line": 3,
  "name": "",
  "description": "to reach the office at right time using vehicle",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyTag"
    }
  ]
});
formatter.before({
  "duration": 683077,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "ive to reach office at 10 in morning",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i take out vehicle",
  "rows": [
    {
      "cells": [
        "vehicle",
        "how",
        "capacity"
      ],
      "line": 8
    },
    {
      "cells": [
        "bike",
        "drive",
        "full"
      ],
      "line": 9
    },
    {
      "cells": [
        "car",
        "drive",
        "half"
      ],
      "line": 10
    },
    {
      "cells": [
        "chopper",
        "flying",
        "full"
      ],
      "line": 11
    },
    {
      "cells": [
        "aeroplane",
        "flying",
        "full"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "i may reach the office at correct time",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 23
    }
  ],
  "location": "TransportStep.ive_to_reach_office_at_in_morning(int)"
});
formatter.result({
  "duration": 491076,
  "status": "passed"
});
formatter.match({
  "location": "TransportStep.i_take_out_vehicle(DataTable)"
});
formatter.result({
  "duration": 5656611,
  "status": "passed"
});
formatter.match({
  "location": "TransportStep.i_may_reach_the_office_at_correct_time()"
});
formatter.result({
  "duration": 558358,
  "status": "passed"
});
formatter.after({
  "duration": 208410,
  "status": "passed"
});
});