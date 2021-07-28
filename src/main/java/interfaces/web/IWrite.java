package interfaces.web;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IWrite extends IClick {
	static Logger logger = LogWeb.getLogger(IWrite.class);

	default void write(By element, String text) {
		try {
			logger.info(String.format("Do a method [write] with element [%s] and text [%s].", element,
					text));
			DriverWeb.getDriver().findElement(element).clear();
			DriverWeb.getDriver().findElement(element).sendKeys(Keys.END + Keys.chord(Keys.SHIFT, Keys.HOME));
			DriverWeb.getDriver().findElement(element).sendKeys(text);
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+element);
		} 
	}

	default void superWrite(By element, String text) {
		try {
			logger.info(String.format("Do a method [superEscrever] with element [%s] and text [%s].",
					element, text));
			WebElement webElement = DriverWeb.getDriver().findElement(element);
			superClick(element);
			webElement.clear();
			webElement.sendKeys(text);
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+element);
		} 
	}

	default void writeACharOneByOne(By element, String text) {
		try {
			logger.info(
					String.format("Do a method [writeACharOneByOne] with element [%s] and text [%s].",
							element, text));
			DriverWeb.getDriver().findElement(element).clear();
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				String s = new StringBuilder().append(c).toString();
				DriverWeb.getDriver().findElement(element).sendKeys(s);
			}
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+element);
		} 
	}

	default void writeACharOneByOne(WebElement element, String text) {
		try {
			logger.info(
					String.format("Do a method [writeACharOneByOne] with element [%s] and text [%s].",
							element, text));
			element.clear();
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				String s = new StringBuilder().append(c).toString();
				(element).sendKeys(s);
			}
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+element);
		} 
	}
	
	default void write(WebElement element, String text) {
		try {
			logger.info(String.format("Do a method [write] with element [%s] and text [%s].", element,
					text));
			(element).sendKeys(Keys.END + Keys.chord(Keys.SHIFT, Keys.HOME));
			(element).sendKeys(text);
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+element);
		} 
	}
}
