$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/login.feature");
formatter.feature({
  "name": "Free CRM Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Free CRM Login Test Feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.LoginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
});