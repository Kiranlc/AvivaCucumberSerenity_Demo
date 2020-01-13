$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/DemoScenarios.feature");
formatter.feature({
  "name": "In order to search Aviva in Google",
  "description": "User search Aviva in google\nUser verifies the result links on return page\nUser navigates to AVIVA INDIA\nUser verifies error message for blank Policy Number and Date of Birth",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search \u0027Aviva\u0027 on Google search Page and verify the 3rd link.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario-1"
    }
  ]
});
formatter.step({
  "name": "the User is on Google search Page",
  "keyword": "Given "
});
formatter.step({
  "name": "the User Enters \u0027\u003cKeyword\u003e\u0027 in search bar",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "the User gets the links count on search page",
  "keyword": "Then "
});
formatter.step({
  "name": "the user prints the text of 3rd link in the search result",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Keyword"
      ]
    },
    {
      "cells": [
        "Aviva"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search \u0027Aviva\u0027 on Google search Page and verify the 3rd link.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario-1"
    }
  ]
});
formatter.step({
  "name": "the User is on Google search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleStepDfns.theUserisonGooglesearhPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User Enters \u0027Aviva\u0027 in search bar",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleStepDfns.theUserEntersAvivainsearchbar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepDfns.theuserclicksonsearchbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User gets the links count on search page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepDfns.theUsergetsthelinkscountonsearchpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user prints the text of 3rd link in the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepDfns.theuserprintsthetextof5thlinkinthesearchresult()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User submit \u0027Pay Premium\u0027 with out providing Policy Number and Date of birth on Aviva INDIA and Validate the Error",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario-2"
    }
  ]
});
formatter.step({
  "name": "the user is on Aviva India Page",
  "keyword": "Given "
});
formatter.step({
  "name": "the User Clicks on Existing User",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on pay premium",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on submit without entering policyNumber and Date of birth",
  "keyword": "Then "
});
formatter.step({
  "name": "user should see \u0027\u003cerror message\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "error message"
      ]
    },
    {
      "cells": [
        "Please enter Policy Number, Date of Birth."
      ]
    }
  ]
});
formatter.scenario({
  "name": "User submit \u0027Pay Premium\u0027 with out providing Policy Number and Date of birth on Aviva INDIA and Validate the Error",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario-2"
    }
  ]
});
formatter.step({
  "name": "the user is on Aviva India Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AvivaStepDfns.theuserisonAvivaIndiaPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User Clicks on Existing User",
  "keyword": "And "
});
formatter.match({
  "location": "AvivaStepDfns.theUserClicksonExistingUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on pay premium",
  "keyword": "Then "
});
formatter.match({
  "location": "AvivaStepDfns.theuserclicksonpaypremium()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit without entering policyNumber and Date of birth",
  "keyword": "Then "
});
formatter.match({
  "location": "AvivaStepDfns.userclicksonsubmitwithoutenteringpolicyNumberandDateofbirth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \u0027Please enter Policy Number, Date of Birth.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AvivaStepDfns.usershouldseeerrorMsg(String)"
});
formatter.result({
  "status": "passed"
});
});