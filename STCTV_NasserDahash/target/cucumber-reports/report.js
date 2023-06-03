$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BH.feature");
formatter.feature({
  "line": 1,
  "name": "Assert the package in the BH version",
  "description": "As a customer\nI want to see stcTV package page in BH country\nSo I can view the Package details with revelent informations",
  "id": "assert-the-package-in-the-bh-version",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9486392125,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "The customer in the main subscription page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The customer go to BH version",
  "keyword": "When "
});
formatter.match({
  "location": "BHSteps.Customer_on_Subscription_page()"
});
formatter.result({
  "duration": 65689664666,
  "status": "passed"
});
formatter.match({
  "location": "BHSteps.Customer_Go_To_Package_details_BH()"
});
