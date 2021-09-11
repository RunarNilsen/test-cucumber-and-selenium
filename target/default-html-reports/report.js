$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountTypes.feature");
formatter.feature({
  "name": "Account types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Driver user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the tittle contains \"Calendar Events - Activities\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_tittle_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Store manager user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"storemanager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Customers\" \"Contacts\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the tittle contains \"Contacts - Customers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_tittle_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "#"
    },
    {
      "name": "it"
    },
    {
      "name": "will"
    },
    {
      "name": "assign"
    },
    {
      "name": "@login"
    },
    {
      "name": "to"
    },
    {
      "name": "all"
    },
    {
      "name": "scenario.So"
    },
    {
      "name": "we"
    },
    {
      "name": "can"
    },
    {
      "name": "run"
    },
    {
      "name": "all"
    },
    {
      "name": "scenarios"
    },
    {
      "name": "by"
    },
    {
      "name": "using"
    },
    {
      "name": "tags"
    },
    {
      "name": "\u003d"
    },
    {
      "name": "\"@login\""
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "#"
    },
    {
      "name": "it"
    },
    {
      "name": "will"
    },
    {
      "name": "assign"
    },
    {
      "name": "@login"
    },
    {
      "name": "to"
    },
    {
      "name": "all"
    },
    {
      "name": "scenario.So"
    },
    {
      "name": "we"
    },
    {
      "name": "can"
    },
    {
      "name": "run"
    },
    {
      "name": "all"
    },
    {
      "name": "scenarios"
    },
    {
      "name": "by"
    },
    {
      "name": "using"
    },
    {
      "name": "tags"
    },
    {
      "name": "\u003d"
    },
    {
      "name": "\"@login\""
    },
    {
      "name": "@driver"
    },
    {
      "name": "@VYT-123"
    }
  ]
});
formatter.step({
  "name": "the user enters the driver information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_enters_the_driver_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a sales manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "#"
    },
    {
      "name": "it"
    },
    {
      "name": "will"
    },
    {
      "name": "assign"
    },
    {
      "name": "@login"
    },
    {
      "name": "to"
    },
    {
      "name": "all"
    },
    {
      "name": "scenario.So"
    },
    {
      "name": "we"
    },
    {
      "name": "can"
    },
    {
      "name": "run"
    },
    {
      "name": "all"
    },
    {
      "name": "scenarios"
    },
    {
      "name": "by"
    },
    {
      "name": "using"
    },
    {
      "name": "tags"
    },
    {
      "name": "\u003d"
    },
    {
      "name": "\"@login\""
    },
    {
      "name": "@sales_manager"
    },
    {
      "name": "@VYT-123"
    }
  ]
});
formatter.step({
  "name": "the user enters the sales manager information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_enters_the_sales_manager_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a store manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "#"
    },
    {
      "name": "it"
    },
    {
      "name": "will"
    },
    {
      "name": "assign"
    },
    {
      "name": "@login"
    },
    {
      "name": "to"
    },
    {
      "name": "all"
    },
    {
      "name": "scenario.So"
    },
    {
      "name": "we"
    },
    {
      "name": "can"
    },
    {
      "name": "run"
    },
    {
      "name": "all"
    },
    {
      "name": "scenarios"
    },
    {
      "name": "by"
    },
    {
      "name": "using"
    },
    {
      "name": "tags"
    },
    {
      "name": "\u003d"
    },
    {
      "name": "\"@login\""
    },
    {
      "name": "@store_manager"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user enters the store manager information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_enters_the_store_manager_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});