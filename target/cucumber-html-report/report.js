$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/com/cucumber/app/salesforce/login.feature");
formatter.feature({
  "line": 1,
  "name": "Salesforce Login",
  "description": "In order to work\r\nAs as sales person \r\nI want to login",
  "id": "salesforce-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Salesforce Login",
  "description": "",
  "id": "salesforce-login;salesforce-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I go to \"loginURL\" on \"Mozilla\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"loginusername\" as \"deepigaa1gayathri@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"loginpassword\" as \"vishnu@2012\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on \"loginButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "login should be \"success\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "loginURL",
      "offset": 9
    },
    {
      "val": "Mozilla",
      "offset": 23
    }
  ],
  "location": "LoginTest.I_goto_Salesforce(String,String)"
});
formatter.result({
  "duration": 15027326180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginusername",
      "offset": 9
    },
    {
      "val": "deepigaa1gayathri@gmail.com",
      "offset": 28
    }
  ],
  "location": "LoginTest.I_enter(String,String)"
});
formatter.result({
  "duration": 822652764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginpassword",
      "offset": 9
    },
    {
      "val": "vishnu@2012",
      "offset": 28
    }
  ],
  "location": "LoginTest.I_enter(String,String)"
});
formatter.result({
  "duration": 940785950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginButton",
      "offset": 12
    }
  ],
  "location": "LoginTest.I_click(String)"
});
formatter.result({
  "duration": 657249479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 17
    }
  ],
  "location": "LoginTest.login_should_be(String)"
});
formatter.result({
  "duration": 4171978791,
  "status": "passed"
});
});