package paginas;

import elementos.ElementsAmazon;
import interacoes.InteracaoWeb;

public class PageAmazon implements InteracaoWeb {
	ElementsAmazon eleAmazon = new ElementsAmazon();
	
	public void searchForInTheSearchBar(String text) {
		write(eleAmazon.getInputSearchBarAmazon(), text);
		click(eleAmazon.getBtnSearchBarAmazon());
		
	}

}
