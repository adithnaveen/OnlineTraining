$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("insurance.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# this line is comment"
    }
  ],
  "line": 6,
  "name": "Policy getting maturity",
  "description": "",
  "id": "policy-getting-maturity",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 623590,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "",
  "description": "",
  "id": "policy-getting-maturity;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# all BDD rules goes here"
    },
    {
      "line": 10,
      "value": "# Given When Then And But"
    }
  ],
  "line": 11,
  "name": "The policy is issued",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Policy attains maturity of ten years",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Pay policy amount of 30000",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Recieve policy document",
  "keyword": "And "
});
formatter.match({
  "location": "InsuranceStep.the_policy_is_issued()"
});
formatter.result({
  "duration": 519527172,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ten",
      "offset": 27
    }
  ],
  "location": "InsuranceStep.policy_attains_maturity_of_ten_years(String)"
});
formatter.result({
  "duration": 10886970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30000",
      "offset": 21
    }
  ],
  "location": "InsuranceStep.pay_policy_amount_of_some_thousand(int)"
});
formatter.result({
  "duration": 1741948,
  "status": "passed"
});
formatter.match({
  "location": "InsuranceStep.recieve_policy_document()"
});
formatter.result({
  "duration": 105436,
  "status": "passed"
});
formatter.after({
  "duration": 218667,
  "status": "passed"
});
formatter.before({
  "duration": 506666,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "policy-getting-maturity;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "# all BDD rules goes here"
    },
    {
      "line": 19,
      "value": "# Given When Then And But"
    }
  ],
  "line": 20,
  "name": "The policy is issued",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Policy attains maturity of twenty years",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Pay policy amount of 40000",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Recieve policy document",
  "keyword": "And "
});
formatter.match({
  "location": "InsuranceStep.the_policy_is_issued()"
});
formatter.result({
  "duration": 396718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "twenty",
      "offset": 27
    }
  ],
  "location": "InsuranceStep.policy_attains_maturity_of_ten_years(String)"
});
formatter.result({
  "duration": 235897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40000",
      "offset": 21
    }
  ],
  "location": "InsuranceStep.pay_policy_amount_of_some_thousand(int)"
});
formatter.result({
  "duration": 279795,
  "status": "passed"
});
formatter.match({
  "location": "InsuranceStep.recieve_policy_document()"
});
formatter.result({
  "duration": 211282,
  "status": "passed"
});
formatter.after({
  "duration": 157949,
  "status": "passed"
});
formatter.before({
  "duration": 191180,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "",
  "id": "policy-getting-maturity;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "# all BDD rules goes here"
    },
    {
      "line": 29,
      "value": "# Given When Then And But"
    }
  ],
  "line": 30,
  "name": "The policy is issued",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Policy attains maturity of thirty years",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Pay policy amount of 50000",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Recieve policy document",
  "keyword": "And "
});
formatter.match({
  "location": "InsuranceStep.the_policy_is_issued()"
});
formatter.result({
  "duration": 528410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thirty",
      "offset": 27
    }
  ],
  "location": "InsuranceStep.policy_attains_maturity_of_ten_years(String)"
});
formatter.result({
  "duration": 373743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50000",
      "offset": 21
    }
  ],
  "location": "InsuranceStep.pay_policy_amount_of_some_thousand(int)"
});
formatter.result({
  "duration": 1038358,
  "status": "passed"
});
formatter.match({
  "location": "InsuranceStep.recieve_policy_document()"
});
formatter.result({
  "duration": 125128,
  "status": "passed"
});
formatter.after({
  "duration": 391384,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# This feature is to show working of tags in cucumber"
    }
  ],
  "line": 4,
  "name": "Login for web application",
  "description": "",
  "id": "login-for-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Sanity"
    },
    {
      "line": 2,
      "name": "@Somke"
    }
  ]
});
formatter.before({
  "duration": 235077,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "",
  "description": "",
  "id": "login-for-web-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "username and password",
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
        "aswini",
        "sridhar"
      ],
      "line": 9
    },
    {
      "cells": [
        "rahda",
        "halebidu"
      ],
      "line": 10
    },
    {
      "cells": [
        "naveen",
        "kumar"
      ],
      "line": 11
    },
    {
      "cells": [
        "kanchan",
        "secret"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the credentials are validated",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "redirect the appliction to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.username_and_password(DataTable)"
});
formatter.result({
  "duration": 4947690,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_credentials_are_validated()"
});
formatter.result({
  "duration": 254769,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.redirect_the_appliction_to_home_page()"
});
formatter.result({
  "duration": 323282,
  "status": "passed"
});
formatter.after({
  "duration": 7513022,
  "status": "passed"
});
formatter.uri("shopping.feature");
formatter.feature({
  "line": 4,
  "name": "checking out the filled cart",
  "description": "",
  "id": "checking-out-the-filled-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "the user is \"\u003cloginstatus\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"\u003cpaymentmode\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;",
  "rows": [
    {
      "cells": [
        "loginstatus",
        "paymentmode"
      ],
      "line": 21,
      "id": "checking-out-the-filled-cart;;;1"
    },
    {
      "cells": [
        "loggedin",
        "debitcard"
      ],
      "line": 22,
      "id": "checking-out-the-filled-cart;;;2"
    },
    {
      "cells": [
        "loggedin",
        "credicard"
      ],
      "line": 23,
      "id": "checking-out-the-filled-cart;;;3"
    },
    {
      "cells": [
        "loggedin",
        "paypal"
      ],
      "line": 24,
      "id": "checking-out-the-filled-cart;;;4"
    },
    {
      "cells": [
        "loggedin",
        "cod"
      ],
      "line": 25,
      "id": "checking-out-the-filled-cart;;;5"
    },
    {
      "cells": [
        "notlogged",
        "debitcard"
      ],
      "line": 26,
      "id": "checking-out-the-filled-cart;;;6"
    },
    {
      "cells": [
        "notlogged",
        "cod"
      ],
      "line": 27,
      "id": "checking-out-the-filled-cart;;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 599385,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "# background will execute each time for each scenario"
    },
    {
      "line": 7,
      "value": "# the background will be treated likfe before in junit only for"
    },
    {
      "line": 8,
      "value": "# the current feature file"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the browser is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.the_path_is_set()"
});
formatter.result({
  "duration": 758564,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 119385,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user is \"loggedin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"debitcard\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "loggedin",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.the_user_is(String)"
});
formatter.result({
  "duration": 942769,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_user_selects_products()"
});
formatter.result({
  "duration": 217436,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.adds_the_products_to_cart()"
});
formatter.result({
  "duration": 113641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "debitcard",
      "offset": 25
    }
  ],
  "location": "ShoppingStep.pays_the_amount_through(String)"
});
formatter.result({
  "duration": 368821,
  "status": "passed"
});
formatter.after({
  "duration": 116923,
  "status": "passed"
});
formatter.before({
  "duration": 128410,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "# background will execute each time for each scenario"
    },
    {
      "line": 7,
      "value": "# the background will be treated likfe before in junit only for"
    },
    {
      "line": 8,
      "value": "# the current feature file"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the browser is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.the_path_is_set()"
});
formatter.result({
  "duration": 261743,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 96000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user is \"loggedin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"credicard\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "loggedin",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.the_user_is(String)"
});
formatter.result({
  "duration": 249025,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_user_selects_products()"
});
formatter.result({
  "duration": 363076,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.adds_the_products_to_cart()"
});
formatter.result({
  "duration": 2004101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "credicard",
      "offset": 25
    }
  ],
  "location": "ShoppingStep.pays_the_amount_through(String)"
});
formatter.result({
  "duration": 1447794,
  "status": "passed"
});
formatter.after({
  "duration": 3821536,
  "status": "passed"
});
formatter.before({
  "duration": 609640,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "# background will execute each time for each scenario"
    },
    {
      "line": 7,
      "value": "# the background will be treated likfe before in junit only for"
    },
    {
      "line": 8,
      "value": "# the current feature file"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the browser is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.the_path_is_set()"
});
formatter.result({
  "duration": 340102,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 96000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user is \"loggedin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"paypal\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "loggedin",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.the_user_is(String)"
});
formatter.result({
  "duration": 370052,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_user_selects_products()"
});
formatter.result({
  "duration": 407795,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.adds_the_products_to_cart()"
});
formatter.result({
  "duration": 314667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "paypal",
      "offset": 25
    }
  ],
  "location": "ShoppingStep.pays_the_amount_through(String)"
});
formatter.result({
  "duration": 324513,
  "status": "passed"
});
formatter.after({
  "duration": 489846,
  "status": "passed"
});
formatter.before({
  "duration": 149743,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "# background will execute each time for each scenario"
    },
    {
      "line": 7,
      "value": "# the background will be treated likfe before in junit only for"
    },
    {
      "line": 8,
      "value": "# the current feature file"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the browser is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.the_path_is_set()"
});
formatter.result({
  "duration": 340102,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 743384,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user is \"loggedin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"cod\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "loggedin",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.the_user_is(String)"
});
formatter.result({
  "duration": 469743,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_user_selects_products()"
});
formatter.result({
  "duration": 102564,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.adds_the_products_to_cart()"
});
formatter.result({
  "duration": 96000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cod",
      "offset": 25
    }
  ],
  "location": "ShoppingStep.pays_the_amount_through(String)"
});
formatter.result({
  "duration": 752410,
  "status": "passed"
});
formatter.after({
  "duration": 3703793,
  "status": "passed"
});
formatter.before({
  "duration": 146872,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "# background will execute each time for each scenario"
    },
    {
      "line": 7,
      "value": "# the background will be treated likfe before in junit only for"
    },
    {
      "line": 8,
      "value": "# the current feature file"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the browser is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.the_path_is_set()"
});
formatter.result({
  "duration": 395077,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 166975,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user is \"notlogged\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"debitcard\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "notlogged",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.the_user_is(String)"
});
formatter.result({
  "duration": 308102,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_user_selects_products()"
});
formatter.result({
  "duration": 265846,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.adds_the_products_to_cart()"
});
formatter.result({
  "duration": 509949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "debitcard",
      "offset": 25
    }
  ],
  "location": "ShoppingStep.pays_the_amount_through(String)"
});
formatter.result({
  "duration": 183795,
  "status": "passed"
});
formatter.after({
  "duration": 102564,
  "status": "passed"
});
formatter.before({
  "duration": 3386255,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "# background will execute each time for each scenario"
    },
    {
      "line": 7,
      "value": "# the background will be treated likfe before in junit only for"
    },
    {
      "line": 8,
      "value": "# the current feature file"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "the path is set",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the browser is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.the_path_is_set()"
});
formatter.result({
  "duration": 772102,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_browser_is_loaded()"
});
formatter.result({
  "duration": 1499486,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "",
  "id": "checking-out-the-filled-cart;;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Shopping"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user is \"notlogged\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user selects products",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "adds the products to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Pays the amount through \"cod\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "notlogged",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.the_user_is(String)"
});
formatter.result({
  "duration": 798359,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.the_user_selects_products()"
});
formatter.result({
  "duration": 79180,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.adds_the_products_to_cart()"
});
formatter.result({
  "duration": 83692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cod",
      "offset": 25
    }
  ],
  "location": "ShoppingStep.pays_the_amount_through(String)"
});
formatter.result({
  "duration": 270769,
  "status": "passed"
});
formatter.after({
  "duration": 143180,
  "status": "passed"
});
});