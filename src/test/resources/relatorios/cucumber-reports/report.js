$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchInAmazon.feature");
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
formatter.match({
  "arguments": [
    {
      "val": "www.google.com",
      "offset": 17
    }
  ],
  "location": "SearchInAmazonSteps.openBrowserOn(String)"
});
formatter.result({
  "duration": 1097139400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Brasil",
      "offset": 12
    }
  ],
  "location": "SearchInAmazonSteps.searchForAndSearch(String)"
});
formatter.result({
  "duration": 2251900200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.amazon.com.br",
      "offset": 13
    }
  ],
  "location": "SearchInAmazonSteps.navigateToThroughTheSearchPage(String)"
});
formatter.result({
  "duration": 1580207800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 12
    }
  ],
  "location": "SearchInAmazonSteps.searchForUsingTheSearchBar(String)"
});
formatter.result({
  "duration": 2336165600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "The Higher Price In The First Page Can\u0027t Be Greater Than U$2000",
  "description": "",
  "id": "wex-challenge;the-higher-price-in-the-first-page-can\u0027t-be-greater-than-u$2000",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@S2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Find The The More Expensive \"Iphone\" In Page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Convert Its Value To USD Using \"https://exchangeratesapi.io/\" API",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Make Sure The Converted Value Is Not Greater Than US\"2000\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 29
    }
  ],
  "location": "SearchInAmazonSteps.findTheTheMoreExpensiveInPage(String)"
});
formatter.result({
  "duration": 1708818600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://exchangeratesapi.io/",
      "offset": 32
    }
  ],
  "location": "SearchInAmazonSteps.convertItsValueToUSDUsingAPI(String)"
});
formatter.result({
  "duration": 1179600,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.SearchInAmazonSteps.convertItsValueToUSDUsingAPI(SearchInAmazonSteps.java:56)\r\n\tat ✽.And Convert Its Value To USD Using \"https://exchangeratesapi.io/\" API(SearchInAmazon.feature:18)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 53
    }
  ],
  "location": "SearchInAmazonSteps.makeSureTheConvertedValueIsNotGreaterThanUS(String)"
});
formatter.result({
  "status": "skipped"
});
});