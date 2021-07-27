package elementos;

import org.openqa.selenium.By;

public class ElementsAmazon {
	private By inputSearchBarAmazon = By.id("twotabsearchtextbox");
	private By btnSearchBarAmazon = By.id("nav-search-submit-text");
	private By textResultSearch = By.xpath("//a[@class='a-link-normal a-text-normal']/span");
	private By textWholePrice = By.xpath("//span[@class='a-price-whole']");
	private By textFractionPrice = By.xpath("//span[@class='a-price-fraction']");
	private By textPriceOfProducts = By.xpath("//a[@class='a-link-normal a-text-normal']/../../..//span[@class='a-price-whole']");
	
	public By getTextPriceOfProducts() {
		return textPriceOfProducts;
	}
	
	public By getTextFractionPrice() {
		return textFractionPrice;
	}
	
	public By getTextWholePrice() {
		return textWholePrice;
	}
	
	public By getTextResultSearch() {
		return textResultSearch;
	}
	
	public By getBtnSearchBarAmazon() {
		return btnSearchBarAmazon;
	}
	
	public By getInputSearchBarAmazon() {
		return inputSearchBarAmazon;
	}
}
