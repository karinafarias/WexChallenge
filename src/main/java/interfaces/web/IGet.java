package interfaces.web;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IGet {
	static Logger logger = LogWeb.getLogger(IGet.class);

	default String getText(By elemento) {
		String retorno = null;
		try {
			logger.info(String.format("Do method[obterTexto] with the element [%s].", elemento));
			retorno = DriverWeb.getDriver().findElement(elemento).getText();
			logger.info(String.format("Obteve o texto [%s].", retorno));
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return retorno;
	}

	default List<String> getTexts(By elemento) {
		List<String> retorno = new ArrayList<>();
		try {
			logger.info(String.format("Do method [getTexts] with element [%s].", elemento));
			DriverWeb.getDriver().findElements(elemento).
			stream().forEach(e->retorno.add(e.getText()));
				
			logger.info(String.format("Get texts [%s].", retorno));
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return retorno;
	}

	default String obterTexto(WebElement elemento) {
		String retorno = null;
		try {
			logger.info(String.format("Do method[obterTexto] with the element [%s].", elemento));
			retorno = (elemento).getText();
			logger.info(String.format("Obteve o texto [%s].", retorno));
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return retorno;
	}

	default String obterValorCss(By elemento, String elementoCss) {
		String retorno = null;
		try {
			logger.info(String.format("Do method[obterValorCss] with the element [%s] e o valor [%s].", elemento, elementoCss));
			retorno = DriverWeb.getDriver().findElement(elemento).getCssValue(elementoCss);
			logger.info(String.format("Get text [%s].", retorno));
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return retorno;
	}

	default String obterValorDeUmAtributoDoElemento(By elemento, String atributoAserObtidoOValor) {
		String retorno = null;
		try {
			logger.info(String.format(
					"Do method[obterValorDeUmAtributoDoElemento] do elemento [%s] e atributo [%s].", elemento, atributoAserObtidoOValor));
			retorno = DriverWeb.getDriver().findElement(elemento).getAttribute(atributoAserObtidoOValor);
			logger.info(String.format("Get text [%s].", retorno));
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return retorno;
	}

	default String obterValorDeUmAtributoDoElemento(WebElement elemento, String atributoAserObtidoOValor) {
		String retorno = null;
		try {
			logger.info(String.format(
					"Do method[obterValorDeUmAtributoDoElemento] do elemento [%s] e atributo [%s].", elemento, atributoAserObtidoOValor));
			retorno = elemento.getAttribute(atributoAserObtidoOValor);
			logger.info(String.format("Get text [%s].", retorno));
		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return retorno;
	}
	
	default String obterAtributoPorLabel(String label, String atributo) {
		logger.info(String.format("Do method[obterTextoPorLabel] with the element [%s] e atributo [%s].",
				label, atributo));
		String retorno = null;
		try {
			String xpath = "//b[text()='%s']/../following-sibling::input[@type='hidden']";
			By elemento = By.xpath(String.format(xpath, label));
			retorno = DriverWeb.getDriver().findElement(elemento).getAttribute(atributo);
			logger.info(String.format("Get text [%s].", retorno));
			return retorno;
		}catch (NoSuchElementException e) {
			logger.error(" -- ERRO: label: '" + label + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar a label: '" + label + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar a label: '" + label);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar a label: '" + label + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: label: '" + label + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- A label: " + label + "NAO esta visivel' em tela.");
		}
		return retorno;
	}

	default String obterTextoHidden(By elemento) {
		try {
			logger.info(String.format("Do method[obterTexto] with the element [%s].", elemento));
			String retorno = DriverWeb.getDriver().findElement(elemento).getAttribute("innerText");
			logger.info(String.format("Get text [%s].", retorno));
			return retorno;

		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o elemento: '" + elemento + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar o elemento: '" + elemento);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o elemento: '" + elemento + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O elemento: " + elemento + "NAO esta visivel' em tela.");
		}
		return null;
	}
}