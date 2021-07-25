$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testing.feature");
formatter.feature({
  "line": 2,
  "name": "Wex challenge",
  "description": "",
  "id": "wex-challenge",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WexChallenge"
    }
  ]
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open Browser on \"www.google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search for \"Amazon Brasil\" and Search",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"www.amazon.com.br\" Through The Search Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Search For \"Iphone\" Using The Search Bar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "80% Of Shown Products Should Be Exclusively The Searched Product",
  "description": "",
  "id": "wex-challenge;80%-of-shown-products-should-be-exclusively-the-searched-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@S1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Count The Total List Of Found Products",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Count The Total Of \"Iphone\" Items Found",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Make Sure At Least \"80\"% Of Items Found are \"Iphone\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});