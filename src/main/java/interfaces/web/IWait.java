package interfaces.web;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IWait {
	static Logger logger = LogWeb.getLogger(IWait.class);
	long TIMEOUT = 40;

	default void waitBeClickable(By element, int timeInSeconds) {
		try {
			logger.info(String.format(
					"Do method [waitBeClickable] with the element[%s]for %d seconds", element,
					timeInSeconds));
			WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(), timeInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage());
		}
	}
	
	default void waitBeClickable(WebElement element, int timeInSeconds) {
		try {
			logger.info(String.format(
					"Do method [esperarelementSerClicavel] with the element[%s]for %d seconds", element,
					timeInSeconds));
			WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(), timeInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage());
		}
	}
	
	default void waitUrlLoading(String url, int timeInSeconds) {
		try {
			logger.info(String.format("Do method [waitUrlLoading] with url [%s] for %d seconds",
					url, timeInSeconds));
			WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(), timeInSeconds);
			wait.until(ExpectedConditions.urlMatches(url));
		} catch (TimeoutException e) {
			logger.error(e.getMessage() + url);
			Assert.fail(LocalDateTime.now() + " "+ e.getMessage() + " " + url );
		}
	}

	default void waitLoading(int posTime, long time) {
		logger.info(String.format("Do method [waitLoading]for %d seconds.", posTime));
		WebDriver driver = DriverWeb.getDriver();
		try {
			ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
				}
			};
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(pageLoadCondition);
			
		} catch (TimeoutException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " +e.getMessage());
		}
	}
	

	default void setDefaultTimeoutImplicito() {
		DriverWeb.getDriver().manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	}


}