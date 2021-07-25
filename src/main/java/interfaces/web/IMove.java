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

public interface IMove extends IMoveJS {
	static Logger logger = LogWeb.getLogger(IMove.class);

	/**
	 * @param elemento
	 */
	default void moveToElement(By elemento) {
		try {
			logger.info(String.format("Do method [moveToElement] with the element[%s].", elemento));	
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(DriverWeb.getDriver().findElement(elemento)).build().perform();		
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + elemento );
		} 
	}

	default void moveToElement(WebElement elemento) {
		try {
			logger.info(String.format("Do method [moveToElement] with the element[%s].", elemento));
			Actions action = new Actions(DriverWeb.getDriver());	
			action.moveToElement(elemento).build().perform();
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + elemento );
		}
	}

	default Boolean moveToElementAndClick(By elemento) {
		try {
			logger.info(String.format("Do method [moveToElementAndClick] with the element[%s].", elemento));
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(DriverWeb.getDriver().findElement(elemento)).click().build().perform();	
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + elemento );
		}
		return true;
	}

	default void moveToElementAndClick(WebElement elemento) {
		try {
			logger.info(String.format("Do method [moveToElementAndClick] with the element[%s].", elemento));
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(elemento).click().perform();	
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + elemento );
		}
	}

	default void keepElementPressed(By elemento) {
		try {
			logger.info(String.format("Do method [keepElementPressed] with the element[%s].", elemento));
			Actions action = new Actions(DriverWeb.getDriver());
			action.clickAndHold(DriverWeb.getDriver().findElement(elemento)).perform();		
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + elemento );
		}
	}

	default void scrollToWebElement(By elemento) {
		logger.info(String.format("Do method [scrollToWebElement] with the element[%s].", elemento));
		WebElement element = DriverWeb.getDriver().findElement(elemento);
		scrollToWebElement(element);	
	}

	default void scrollToWebElement(WebElement elemento) {
		try {
			logger.info(String.format("Do method [scrollToWebElement] with the element[%s].", elemento));
			Actions action = new Actions(DriverWeb.getDriver());
			action.moveToElement(elemento).perform();	
		} catch (ElementNotVisibleException|TimeoutException|NoSuchElementException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage() + " " + elemento );
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