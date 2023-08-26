$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login into Facebook account",
  "description": "",
  "id": "facebook-login;login-into-facebook-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the Facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefFaceBook.user_launch_the_Facebook_application()"
});
formatter.result({
  "duration": 1105701000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFaceBook.user_enter_the_username()"
});
formatter.result({
  "duration": 95855000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFaceBook.user_enter_the_password()"
});
formatter.result({
  "duration": 87691500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFaceBook.user_click_on_Login_Button()"
});
formatter.result({
  "duration": 97498800,
  "status": "passed"
});
});