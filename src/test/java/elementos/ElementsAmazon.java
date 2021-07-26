package elementos;

import org.openqa.selenium.By;

public class ElementsAmazon {
	private By inputSearchBarAmazon = By.id("twotabsearchtextbox");
	private By btnSearchBarAmazon = By.id("nav-search-submit-text");
	
	public By getBtnSearchBarAmazon() {
		return btnSearchBarAmazon;
	}
	
	public By getInputSearchBarAmazon() {
		return inputSearchBarAmazon;
	}
}
