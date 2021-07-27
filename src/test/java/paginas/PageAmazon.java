package paginas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;

import elementos.ElementsAmazon;
import interacoes.InteracaoWeb;
import interfaces.log.LogWeb;

public class PageAmazon implements InteracaoWeb {
	private ElementsAmazon eleAmazon = new ElementsAmazon();
	private Integer sumTotalOfFoundProducts = 0;
	private Integer sumTotalOfFoundProductsWithText = 0;
	private Float maxValue = new Float(0);
	private Float convertedValue = new Float(0);
	private Float iphoneCheaper = new Float(0);
	private Float anotherProductMoreExpensive = new Float(0);
	
	
	Logger logger = LogWeb.getLogger(PageAmazon.class);
	
	public void searchForInTheSearchBar(String text) {
		write(eleAmazon.getInputSearchBarAmazon(), text);
		click(eleAmazon.getBtnSearchBarAmazon());
	}

	public void SumTotalOfFoundProductsInResultOfSearch() {
		sumTotalOfFoundProducts = getTexts(eleAmazon.getTextResultSearch()).size();
		logger.info(sumTotalOfFoundProducts);
	}

	public void SumTotalOfFoundProductsInResultOfSearch(String text) {
		getTexts(eleAmazon.getTextResultSearch()).
			forEach(t->{
				if((t.contains(text)||t.contains("iPhone")||t.contains("IPHONE")||t.contains("iphone"))&&
				!t.contains("Capa")&&
				!t.contains("CAPA")&&
				!t.contains("Carregador")&&
				!t.contains("Braçadeira")&&
				!t.contains("Protetor")&&
				!t.contains("Fone")&&
				!t.contains("Xiaomi")&&
				!t.contains("Cabo")&&
				!t.contains("Pelicula")) {
			sumTotalOfFoundProductsWithText = sumTotalOfFoundProductsWithText +1;
			logger.info(sumTotalOfFoundProductsWithText + " "+ t);
			this.iphoneCheaper = iphoneCheaper.compareTo(Float.parseFloat(getText(eleAmazon.getTextPriceOfProducts())))<0?iphoneCheaper: Float.parseFloat(getText(eleAmazon.getTextPriceOfProducts()));
			logger.info(this.iphoneCheaper);
				}
		});
	}

	public void validateAtLeastOfItensFoundsAre(String percent, String item) {
		logger.info(sumTotalOfFoundProducts* Integer.parseInt(percent)/100);
		logger.info(sumTotalOfFoundProductsWithText);
		if((sumTotalOfFoundProducts* Integer.parseInt(percent)/100) >= sumTotalOfFoundProductsWithText) {
			Assert.fail("Sum of the itens founds are less than 80%");
		}
		
	}

	public void moreExpensiveInPage(String product) {
		List<String>textWholePrices = getTexts(eleAmazon.getTextWholePrice());
		List<String>textFractionPrices = getTexts(eleAmazon.getTextFractionPrice());
		List<String>textPrices = new ArrayList<>();
		List<Float>floatPrices = new ArrayList<>();
		
		for (int i=0; i< textWholePrices.size(); i++) {
			textPrices.add(textWholePrices.get(i).concat(textFractionPrices.get(i)));
		}
		textPrices.forEach(p->{
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			floatPrices.add(Float.parseFloat(df.format(Float.parseFloat(p))));
		});
		
		floatPrices.forEach(fp->{this.maxValue = fp.compareTo(this.maxValue)>0 ? fp: maxValue;});
		logger.info(maxValue);
		
	}

	public void convertValueToUSD() {
		this.convertedValue = (float) (maxValue/100*5.20);
		logger.info(this.convertedValue);
	}

	public void validateTheValueIsLessThan(String value) {
		if(this.convertedValue.compareTo(Float.parseFloat(value))>0) {
			Assert.fail("The converted value is not less than U$2000");
		}
		
	}

	public void productsAreNot(String product) {
		getTexts(eleAmazon.getTextResultSearch()).
		forEach(t->{
			if((t.contains(product)||t.contains("iPhone")||t.contains("IPHONE")||t.contains("iphone"))&&
			t.contains("Capa")||
			t.contains("CAPA")||
			t.contains("Carregador")||
			t.contains("Braçadeira")||
			t.contains("Protetor")||
			t.contains("Fone")||
			t.contains("Xiaomi")||
			t.contains("Cabo")||
			t.contains("Pelicula")) {
				this.anotherProductMoreExpensive = this.anotherProductMoreExpensive.compareTo(Float.parseFloat(getText(eleAmazon.getTextPriceOfProducts())))>0?iphoneCheaper: Float.parseFloat(getText(eleAmazon.getTextPriceOfProducts()));
				logger.info(this.iphoneCheaper);
		}
	});
		
	}

	public void validateValueFoundProductsAreCheaperThanThe(String product) {
		if(this.iphoneCheaper.compareTo(this.anotherProductMoreExpensive)<0) {
			Assert.fail("The price of another product is greater than the "+product);
		}
		
	}
	
	

	

}
