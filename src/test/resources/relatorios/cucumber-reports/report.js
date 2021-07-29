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
  "duration": 893553600,
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
  "duration": 2013449100,
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
  "duration": 1338860100,
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
  "duration": 2372189600,
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
  "duration": 723922000,
  "status": "passed"
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
  "duration": 2874554500,
  "status": "passed"
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
  "duration": 1554200,
  "error_message": "java.lang.AssertionError: Sum of the itens found are less than 80%\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat pages.PageAmazon.validateAtLeastOfItensFoundsAre(PageAmazon.java:62)\r\n\tat steps.SearchInAmazonSteps.makeSureAtLeastOfItemsFoundAre(SearchInAmazonSteps.java:45)\r\n\tat ✽.Then Make Sure At Least \"80\"% Of Items Found are \"Iphone\"(SearchInAmazon.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 157312514900,
  "status": "passed"
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
  "duration": 628892800,
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
  "duration": 1679199000,
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
  "duration": 1249148900,
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
  "duration": 358087700,
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
  "duration": 2953408000,
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
  "duration": 81500,
  "status": "passed"
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
  "duration": 140900,
  "error_message": "java.lang.AssertionError: The converted value greater than U$2000\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat pages.PageAmazon.validateTheValueIsLessThan(PageAmazon.java:94)\r\n\tat steps.SearchInAmazonSteps.makeSureTheConvertedValueIsNotGreaterThanUS(SearchInAmazonSteps.java:61)\r\n\tat ✽.Then Make Sure The Converted Value Is Not Greater Than US\"2000\"(SearchInAmazon.feature:19)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 26503836900,
  "status": "passed"
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
  "duration": 721330900,
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
  "duration": 1496213600,
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
  "duration": 1477423300,
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
  "duration": 319452200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Products Different Than The Searched Product Should Be Cheaper Than The Searched Product",
  "description": "",
  "id": "wex-challenge;products-different-than-the-searched-product-should-be-cheaper-than-the-searched-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@S3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Find Products Which Are Not \"Iphone\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Make Sure All Found Products Are Cheaper Than The Cheapest \"Iphone\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 29
    }
  ],
  "location": "SearchInAmazonSteps.findProductsWhichAreNot(String)"
});
formatter.result({
  "duration": 1680013300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 60
    }
  ],
  "location": "SearchInAmazonSteps.makeSureAllFoundProductsAreCheaperThanTheCheapest(String)"
});
formatter.result({
  "duration": 165700,
  "error_message": "java.lang.AssertionError: The price of another product is greater than the Iphone\n Value of Iphone 0.0\n Value of another products 129.0\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat pages.PageAmazon.validateValueFoundProductsAreCheaperThanThe(PageAmazon.java:121)\r\n\tat steps.SearchInAmazonSteps.makeSureAllFoundProductsAreCheaperThanTheCheapest(SearchInAmazonSteps.java:71)\r\n\tat ✽.Then Make Sure All Found Products Are Cheaper Than The Cheapest \"Iphone\"(SearchInAmazon.feature:24)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 26651728500,
  "status": "passed"
});
});