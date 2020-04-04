$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/OrangeHRMdemo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Login in the OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website;login-in-the-orangehrm-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@TC01_01"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user open the OrangeHRM Home page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "orangehrm-website;login-in-the-orangehrm-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ],
      "line": 32,
      "id": "orangehrm-website;login-in-the-orangehrm-website;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 33,
      "id": "orangehrm-website;login-in-the-orangehrm-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "Login in the OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website;login-in-the-orangehrm-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@TC01_01"
    },
    {
      "line": 19,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user open the OrangeHRM Home page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user login using name1 and 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "SDLoginPage.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 26447048800,
  "status": "passed"
});
formatter.match({
  "location": "SDLoginPage.the_user_open_the_orangehrm_home_page()"
});
formatter.result({
  "duration": 818119600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1",
      "offset": 21
    },
    {
      "val": "5",
      "offset": 31
    }
  ],
  "location": "SDLoginPage.the_user_login_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 7782518600,
  "status": "passed"
});
formatter.match({
  "location": "SDLoginPage.click_on_the_login_button_user_nagivate_to_the_next_pag()"
});
formatter.result({
  "duration": 11325112000,
  "status": "passed"
});
});