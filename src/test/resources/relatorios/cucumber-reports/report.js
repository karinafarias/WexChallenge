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
  "duration": 1084610100,
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
  "duration": 2300092300,
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
  "duration": 1622399700,
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
  "duration": 1812019900,
  "status": "passed"
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
formatter.match({
  "location": "SearchInAmazonSteps.countTheTotalListOfFoundProducts()"
});
formatter.result({
  "duration": 803000,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.SearchInAmazonSteps.countTheTotalListOfFoundProducts(SearchInAmazonSteps.java:36)\r\n\tat ✽.And Count The Total List Of Found Products(SearchInAmazon.feature:11)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 20
    }
  ],
  "location": "SearchInAmazonSteps.countTheTotalOfItemsFound(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "80",
      "offset": 20
    },
    {
      "val": "Iphone",
      "offset": 45
    }
  ],
  "location": "SearchInAmazonSteps.makeSureAtLeastOfItemsFoundAre(String,String)"
});
formatter.result({
  "status": "skipped"
});
});