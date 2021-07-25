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

public interface IWrite extends IClick, IWriteJS {
	static Logger logger = LogWeb.getLogger(IWrite.class);

	default void write(By elemento, String texto) {
		try {
			logger.info(String.format("Do a method [write] with element [%s] and text [%s].", elemento,
					texto));
			DriverWeb.getDriver().findElement(elemento).clear();
			DriverWeb.getDriver().findElement(elemento).sendKeys(Keys.END + Keys.chord(Keys.SHIFT, Keys.HOME));
			DriverWeb.getDriver().findElement(elemento).sendKeys(texto);
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+elemento);
		} 
	}

	default void superWrite(By elemento, String texto) {
		try {
			logger.info(String.format("Do a method [superEscrever] with element [%s] and text [%s].",
					elemento, texto));
			WebElement webElement = DriverWeb.getDriver().findElement(elemento);
			superClick(elemento);
			webElement.clear();
			webElement.sendKeys(texto);
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+elemento);
		} 
	}

	default void writeACharOneByOne(By elemento, String texto) {
		try {
			logger.info(
					String.format("Do a method [writeACharOneByOne] with element [%s] and text [%s].",
							elemento, texto));
			DriverWeb.getDriver().findElement(elemento).clear();
			for (int i = 0; i < texto.length(); i++) {
				char c = texto.charAt(i);
				String s = new StringBuilder().append(c).toString();
				DriverWeb.getDriver().findElement(elemento).sendKeys(s);
			}
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+elemento);
		} 
	}

	default void writeACharOneByOne(WebElement elemento, String texto) {
		try {
			logger.info(
					String.format("Do a method [writeACharOneByOne] with element [%s] and text [%s].",
							elemento, texto));
			elemento.clear();
			for (int i = 0; i < texto.length(); i++) {
				char c = texto.charAt(i);
				String s = new StringBuilder().append(c).toString();
				(elemento).sendKeys(s);
			}
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+elemento);
		} 
	}
	
	default void write(WebElement elemento, String texto) {
		try {
			logger.info(String.format("Do a method [write] with element [%s] and text [%s].", elemento,
					texto));
			(elemento).sendKeys(Keys.END + Keys.chord(Keys.SHIFT, Keys.HOME));
			(elemento).sendKeys(texto);
		} catch (NoSuchElementException|TimeoutException|InvalidElementStateException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage()+" "+elemento);
		} 
	}
}
