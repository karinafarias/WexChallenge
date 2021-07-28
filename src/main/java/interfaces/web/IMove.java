package interfaces.web;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IMove{
	static Logger logger = LogWeb.getLogger(IMove.class);

	/**
	 * @param element
	 */
	default void moveToElement(By element) {
		try {
			logger.info(String.format("Do method [moveToElement] with the element[%s].", element));	
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(DriverWeb.getDriver().findElement(element)).build().perform();		
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element );
		} 
	}

	default void moveToElement(WebElement element) {
		try {
			logger.info(String.format("Do method [moveToElement] with the element[%s].", element));
			Actions action = new Actions(DriverWeb.getDriver());	
			action.moveToElement(element).build().perform();
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element );
		}
	}

	default Boolean moveToElementAndClick(By element) {
		try {
			logger.info(String.format("Do method [moveToElementAndClick] with the element[%s].", element));
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(DriverWeb.getDriver().findElement(element)).click().build().perform();	
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element );
		}
		return true;
	}

	default void moveToElementAndClick(WebElement element) {
		try {
			logger.info(String.format("Do method [moveToElementAndClick] with the element[%s].", element));
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(element).click().perform();	
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element );
		}
	}

	default void keepElementPressed(By element) {
		try {
			logger.info(String.format("Do method [keepElementPressed] with the element[%s].", element));
			Actions action = new Actions(DriverWeb.getDriver());
			action.clickAndHold(DriverWeb.getDriver().findElement(element)).perform();		
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element );
		}
	}

	default void scrollToWebElement(By element) {
		logger.info(String.format("Do method [scrollToWebElement] with the element[%s].", element));
		WebElement ele = DriverWeb.getDriver().findElement(element);
		scrollToWebElement(ele);	
	}

	default void scrollToWebElement(WebElement element) {
		try {
			logger.info(String.format("Do method [scrollToWebElement] with the element[%s].", element));
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(element).perform();	
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element );
		}
	}

	default void moveToElementAndWrite(WebElement element, String texto) {
		try {
			logger.info(String.format("Do method [moveToElementAndWrite] with the element[%s] and write text [%s].", element, texto));
			Actions actions = new Actions(DriverWeb.getDriver());
			actions.moveToElement(element);
			actions.click();
			actions.pause(10);
			actions.sendKeys(texto);
			actions.build().perform();
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + element);
		}

	}

}