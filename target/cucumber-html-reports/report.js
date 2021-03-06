$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCaseWithMobileWeb.feature");
formatter.feature({
  "line": 2,
  "name": "Interview Nicolas Mori",
  "description": "",
  "id": "interview-nicolas-mori",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Case_2A1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Access to the app after make the login.",
  "description": "",
  "id": "interview-nicolas-mori;access-to-the-app-after-make-the-login.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I start the android web test with this device \"\u003cdevice uuid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "navigate to this \"\u003curl\u003e\" in the mobile web",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "in the homepage make click in the button to sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "make a success login",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "in the dashboard page make click in the dropdown, and select this coin \"\u003coption coin\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select this option \"\u003coption menu\u003e\" from the menu",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "validate if the values in the menu change",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "interview-nicolas-mori;access-to-the-app-after-make-the-login.;",
  "rows": [
    {
      "cells": [
        "device uuid",
        "url",
        "option menu",
        "option coin"
      ],
      "line": 14,
      "id": "interview-nicolas-mori;access-to-the-app-after-make-the-login.;;1"
    },
    {
      "cells": [
        "8575525242395141",
        "https://www.kraken.com",
        "Security",
        "ETH/XBT"
      ],
      "line": 15,
      "id": "interview-nicolas-mori;access-to-the-app-after-make-the-login.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Access to the app after make the login.",
  "description": "",
  "id": "interview-nicolas-mori;access-to-the-app-after-make-the-login.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Case_2A1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I start the android web test with this device \"8575525242395141\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "navigate to this \"https://www.kraken.com\" in the mobile web",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "in the homepage make click in the button to sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "make a success login",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "in the dashboard page make click in the dropdown, and select this coin \"ETH/XBT\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select this option \"Security\" from the menu",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "validate if the values in the menu change",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "8575525242395141",
      "offset": 47
    }
  ],
  "location": "Steps.accessTheAndroidWebTest(String)"
});
formatter.result({
  "duration": 11511220011,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.kraken.com",
      "offset": 18
    }
  ],
  "location": "Steps.navigateToSomeUrlInTheMobileWeb(String)"
});
formatter.result({
  "duration": 13718178629,
  "status": "passed"
});
formatter.match({
  "location": "StepsKra.bigWaite22r()"
});
formatter.result({
  "duration": 7652489795,
  "status": "passed"
});
formatter.match({
  "location": "StepsKra.bigWaiter333()"
});
formatter.result({
  "duration": 7664823523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ETH/XBT",
      "offset": 72
    }
  ],
  "location": "StepsKra.bigWaiter4444(String)"
});
formatter.result({
  "duration": 4895585262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Security",
      "offset": 20
    }
  ],
  "location": "StepsKra.bigWaiter333333(String)"
});
formatter.result({
  "duration": 2927474204,
  "status": "passed"
});
formatter.match({
  "location": "StepsKra.bigWaiter444444()"
});
formatter.result({
  "duration": 4836462,
  "status": "passed"
});
});