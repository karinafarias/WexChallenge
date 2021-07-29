package steps;
/**
 * This class contains all the steps of the test
 * The implemetation of these steps are in the classes PageGoogle and PageAmazon(src/test/java/pages)
 * 
 * The feature is in the src/test/java/resources/features
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageAmazon;
import pages.PageGoogle;

public class SearchInAmazonSteps {
	PageGoogle pageGoogle = new PageGoogle();
	PageAmazon pageAmazon = new PageAmazon();

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
	public void searchForUsingTheSearchBar(String text) {
		pageAmazon.searchForInTheSearchBar(text);
	}

	@Given("^Count The Total List Of Found Products$")
	public void countTheTotalListOfFoundProducts() {
		pageAmazon.SumTotalOfFoundProductsInResultOfSearch();
	}

	@Given("^Count The Total Of \"([^\"]*)\" Items Found$")
	public void countTheTotalOfItemsFound(String text) {
		pageAmazon.SumTotalOfFoundProductsInResultOfSearch(text);
	}

	@Then("^Make Sure At Least \"([^\"]*)\"% Of Items Found are \"([^\"]*)\"$")
	public void makeSureAtLeastOfItemsFoundAre(String percent, String item) {
		pageAmazon.validateAtLeastOfItensFoundsAre(percent, item);
	}

	@When("^Find The The More Expensive \"([^\"]*)\" In Page$")
	public void findTheTheMoreExpensiveInPage(String product) {
		pageAmazon.moreExpensiveInPage(product);
	}

	@When("^Convert Its Value To USD Using \"([^\"]*)\" API$")
	public void convertItsValueToUSDUsingAPI(String api) {
		pageAmazon.convertValueToUSD();

	}

	@Then("^Make Sure The Converted Value Is Not Greater Than US\"([^\"]*)\"$")
	public void makeSureTheConvertedValueIsNotGreaterThanUS(String value) {
		pageAmazon.validateTheValueIsLessThan(value);
	}

	@Given("^Find Products Which Are Not \"([^\"]*)\"$")
	public void findProductsWhichAreNot(String product) {
		pageAmazon.productsAreNot(product);
	}

	@Then("^Make Sure All Found Products Are Cheaper Than The Cheapest \"([^\"]*)\"$")
	public void makeSureAllFoundProductsAreCheaperThanTheCheapest(String product) {
		pageAmazon.validateValueFoundProductsAreCheaperThanThe(product);
	}
}
