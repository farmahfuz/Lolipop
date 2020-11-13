$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Login",
  "description": "",
  "id": "search-functionality;verify-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Senity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Signinlink",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Sign in Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter UserPass and click login",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify user login successcefully.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003curl\u003e",
      "offset": 8
    }
  ],
  "location": "HomePageStepDep.launch(String)"
});
formatter.result({
  "duration": 1330498400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.click_on_Signinlink()"
});
formatter.result({
  "duration": 615569000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.click_on_Sign_in_Button()"
});
formatter.result({
  "duration": 3128135900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.enter_UserPass_and_click_login()"
});
formatter.result({
  "duration": 669216500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.verify_user_login_successcefully()"
});
formatter.result({
  "duration": 1981727200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify Search",
  "description": "",
  "id": "search-functionality;verify-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Senity"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "launch \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Write the product Name",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Search",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify search result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003curl\u003e",
      "offset": 8
    }
  ],
  "location": "HomePageStepDep.launch(String)"
});
formatter.result({
  "duration": 1536123100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.write_the_product_Name()"
});
formatter.result({
  "duration": 728348700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.click_on_Search()"
});
formatter.result({
  "duration": 3676865400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.verify_search_result()"
});
formatter.result({
  "duration": 1160278100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify",
  "description": "",
  "id": "search-functionality;verify",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Senity"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "launch \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "mouse over to deals",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "mouse over Desktops deals",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click For Home",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Desktop Computer Deals displaying",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003curl\u003e",
      "offset": 8
    }
  ],
  "location": "HomePageStepDep.launch(String)"
});
formatter.result({
  "duration": 1738793600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.mouse_over_to_deals()"
});
formatter.result({
  "duration": 454726500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.mouse_over_Desktops_deals()"
});
formatter.result({
  "duration": 181135500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.click_For_Home()"
});
formatter.result({
  "duration": 782100800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDep.verify_Desktop_Computer_Deals_displaying()"
});
formatter.result({
  "duration": 1487126200,
  "status": "passed"
});
});