Feature: Wex challenge
Background:
Given Open Browser on "www.google.com"
And Search for "Amazon Brasil" and Search
And Navigate to "www.amazon.com.br" Through The Search Page
And Search For "Iphone" Using The Search Bar

Scenario: 80% Of Shown Products Should Be Exclusively The Searched Product
And Count The Total List Of Found Products
And Count The Total Of "Iphone" Items Found
Then Make Sure At Least "80"% Of Items Found are "Iphone"

Scenario: The Higher Price In The First Page Can't Be Greater Than U$2000
When Find The The More Expensive "Iphone" In Page
And Convert Its Value To USD Using "https://exchangeratesapi.io/" API
Then Make Sure The Converted Value Is Not Greater Than US"2000"

Scenario: Products Different Than The Searched Product Should Be Cheaper Than The Searched Product
And Find Products Which Are Not "Iphone"
Then Make Sure All Found Products Are Cheaper Than The Cheapest "Iphone"