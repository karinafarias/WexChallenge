package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import paginas.PageGoogle;

public class SearchInAmazonSteps {
	PageGoogle pageGoogle = new PageGoogle();
	
@Given("^Open Browser on \"([^\"]*)\"$")
public void openBrowserOn(String url) {
	pageGoogle.openGoogle(url);
}

@Given("^Search for \"([^\"]*)\" and Search$")
public void searchForAndSearch(String text) {
    pageGoogle.searchFor(text);
}

@Given("^Navigate to \"([^\"]*)\" Through The Search Page$")
public void navigateToThroughTheSearchPage(String url) {
    pageGoogle.navigateTo(url);
}

@Given("^Search For \"([^\"]*)\" Using The Search Bar$")
public void searchForUsingTheSearchBar(String arg1) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^Count The Total List Of Found Products$")
public void countTheTotalListOfFoundProducts() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^Count The Total Of \"([^\"]*)\" Items Found$")
public void countTheTotalOfItemsFound(String arg1) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Make Sure At Least \"([^\"]*)\"% Of Items Found are \"([^\"]*)\"$")
public void makeSureAtLeastOfItemsFoundAre(String arg1, String arg2) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}
