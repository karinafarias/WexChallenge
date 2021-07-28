package interfaces.web;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.junit.Assert;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IActionsInBrowser {
	
	static Logger logger = LogWeb.getLogger(IActionsInBrowser.class);
	
	default void openUrl(String url) {
		try {
			logger.info(String.format("Do method [openUrl] to open [%s].", url));
			DriverWeb.getDriver().get(url);
		} catch (Exception e) {
			logger.error(e.getMessage()+" " + url);
			Assert.fail(LocalDateTime.now() +" "+ e.getMessage() +" "+ url);
		}
	}

	default void navegateUrl(String url) {
		try {
			logger.info(String.format("Do method [navegarUrl] with address [%s].", url));
			DriverWeb.getDriver().navigate().to(url);
		} catch (Exception e) {
			logger.error(e.getMessage() +" " + url);
			Assert.fail(LocalDateTime.now() + e.getMessage() +" " + url);
		}
	}
}