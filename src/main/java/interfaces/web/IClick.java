package interfaces.web;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IClick {
	static Logger logger = LogWeb.getLogger(IClick.class);
	long TIMEOUT = 40;

	default Boolean click(WebElement elemento) {
		try {
			logger.info(String.format("Do method [click] with the element [%s].", elemento));
			new WebDriverWait(DriverWeb.getDriver(), TIMEOUT).until(ExpectedConditions.elementToBeClickable(elemento))
					.click();
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " +e.getMessage() +" "+ elemento );
		}
		return true;
	}
	
	default Boolean click(By elemento) {
		try {
			logger.info(String.format("Do method [click] with element [%s].", elemento));
			DriverWeb.getDriver().manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			new WebDriverWait(DriverWeb.getDriver(), TIMEOUT).until(ExpectedConditions.elementToBeClickable(elemento))
					.click();
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " +e.getMessage() +" "+ elemento );
		}
		return true;
	}
	
	default void clickTwice(WebElement elemento) {
		Actions action = new Actions(DriverWeb.getDriver());
		try {
			logger.info(String.format("Do method [clickTwice] with the element [%s].", elemento));
			DriverWeb.getDriver().manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			action.doubleClick(new WebDriverWait(DriverWeb.getDriver(), TIMEOUT)
					.until(ExpectedConditions.elementToBeClickable(elemento)));		
		} catch (Exception e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now()+ e.getMessage() + " " + elemento );
		}
	}
	
	default void clickTwice(By elemento) {
		clickTwice((WebElement)elemento);
	}
	
	default void submitForm(By elemento) {
		try {
			logger.info(String.format("Do method [submitForm] with the element [%s].", elemento));
			DriverWeb.getDriver().manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			DriverWeb.getDriver().findElement(elemento).submit();		
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		} catch (Exception e) {
			logger.error(" -- ERRO: erro ao clicar no elemento:" + elemento);
			Assert.fail(LocalDateTime.now() + "erro ao clicar no elemento:" + elemento);
		}
	}

	default void submitForm(WebElement elemento) {
		try {
			logger.info(String.format("Do method [submitForm] with the element [%s].", elemento));
			DriverWeb.getDriver().manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			elemento.submit();
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		} catch (Exception e) {
			logger.error(" -- ERRO: erro ao clicar no elemento:" + elemento);
			Assert.fail(LocalDateTime.now() + "erro ao clicar no elemento:" + elemento);
		}
	}


	default void duploCliqueOndeEstiverOFocoDoMouse(By elemento) {
		try {
			logger.info(String.format("Do method [duploCliqueOndeEstiverOFocoDoMouse] with the element [%s].", elemento));
			Actions action = new Actions(DriverWeb.getDriver());
			DriverWeb.getDriver().manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			action.moveToElement(new WebDriverWait(DriverWeb.getDriver(), TIMEOUT)
					.until(ExpectedConditions.elementToBeClickable(elemento))).doubleClick().perform();
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		} catch (Exception e) {
			logger.error(" -- ERRO: erro ao clicar no elemento:" + elemento);
			Assert.fail(LocalDateTime.now() + "erro ao clicar no elemento:" + elemento);
		}
	}

	default void duploCliqueOndeEstiverOFocoDoMouse(WebElement elemento) {
		try {
			logger.info(String.format("Do method [duploCliqueOndeEstiverOFocoDoMouse] with the element [%s].",
					elemento));
			Actions action = new Actions(DriverWeb.getDriver());
			DriverWeb.getDriver().manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			action.moveToElement(new WebDriverWait(DriverWeb.getDriver(), TIMEOUT)
					.until(ExpectedConditions.elementToBeClickable(elemento))).doubleClick().perform();	
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		} catch (Exception e) {
			logger.error(" -- ERRO: erro ao clicar no elemento:" + elemento);
			Assert.fail(LocalDateTime.now() + "erro ao clicar no elemento:" + elemento);
		}
	}

	default Boolean superClick(By elemento) {
		WebElement webSuper = DriverWeb.getDriver().findElement(elemento);
		return superClick(webSuper);
	}

	default Boolean superClick(WebElement element) {
		logger.info(String.format("Do method [superClick] with the element [%s].", element));
		WebDriver driver = DriverWeb.getDriver();
		JavascriptExecutor executor = (JavascriptExecutor) DriverWeb.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
		WebElement elemento = element;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(toBy(elemento)));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
			driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			new WebDriverWait(DriverWeb.getDriver(), TIMEOUT).until(ExpectedConditions.elementToBeClickable(elemento))
					.click();
			
		} catch (Exception e) {
			try {
				driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
				executor.executeScript("arguments[0].click();",
						wait.until(ExpectedConditions.elementToBeClickable(elemento)));
			} catch (Exception e2) {
				Actions actions = new Actions(DriverWeb.getDriver());
				actions.moveToElement(element).click(element).build().perform();
			}
		}
		return true;
	}


	/**
	 * To by.
	 *
	 * @param we the we
	 * @return the by
	 */
	default By toBy(WebElement we) {
		WebDriver driver = DriverWeb.getDriver();
		return By.xpath((String) ((JavascriptExecutor) driver)
				.executeScript("function absoluteXPath(element) {" + "var comp, comps = [];" + "var parent = null;"
						+ "var xpath = '';" + "var getPos = function(element) {" + "var position = 1, curNode;"
						+ "if (element.nodeType == Node.ATTRIBUTE_NODE) {" + "return null;" + "}"
						+ "for (curNode = element.previousSibling; curNode; curNode = curNode.previousSibling){"
						+ "if (curNode.nodeName == element.nodeName) {" + "++position;" + "}" + "}" + "return position;"
						+ "};" +

						"if (element instanceof Document) {" + "return '/';" + "}" +

						"for (; element && !(element instanceof Document); element = element.nodeType == Node.ATTRIBUTE_NODE ? element.ownerElement : element.parentNode) {"
						+ "comp = comps[comps.length] = {};" + "switch (element.nodeType) {" + "case Node.TEXT_NODE:"
						+ "comp.name = 'text()';" + "break;" + "case Node.ATTRIBUTE_NODE:"
						+ "comp.name = '@' + element.nodeName;" + "break;" + "case Node.PROCESSING_INSTRUCTION_NODE:"
						+ "comp.name = 'processing-instruction()';" + "break;" + "case Node.COMMENT_NODE:"
						+ "comp.name = 'comment()';" + "break;" + "case Node.ELEMENT_NODE:"
						+ "comp.name = element.nodeName;" + "break;" + "}" + "comp.position = getPos(element);" + "}" +

						"for (var i = comps.length - 1; i >= 0; i--) {" + "comp = comps[i];"
						+ "xpath += '/' + comp.name.toLowerCase();" + "if (comp.position !== null) {"
						+ "xpath += '[' + comp.position + ']';" + "}" + "}" +

						"return xpath;" +

						"} return absoluteXPath(arguments[0]);", we));
	}

	default void clickRandom(By elemento) {
		try {
			logger.info(String.format("Do method [clicarAleatoriamente] with the element [%s].", elemento));
			List<WebElement> elementos = DriverWeb.getDriver().findElements(elemento);
			WebElement elementoSelecionado = elementos.get(new Random().nextInt(elementos.size()));
			logger.info(String.format("Elemento selecionado: %s", elementoSelecionado));
			click(elementoSelecionado);			
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage()+" " + elemento);
			Assert.fail(LocalDateTime.now() + " Argumento por inddex não encontrado para o elemento: '" + elemento + "' em tela.");
		}
	}
}