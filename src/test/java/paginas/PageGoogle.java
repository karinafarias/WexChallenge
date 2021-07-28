package paginas;

import elementos.ElementsGoogle;
import interation.InteractionWeb;

public class PageGoogle implements InteractionWeb {
	private ElementsGoogle eleGoogle = new ElementsGoogle();
	
	public void openGoogle(String url) {
		if(!url.matches("[http{s}://]+")) {
			url="https://"+url;
		}
		openUrl(url);
		waitUrlLoading(url, 20);
	}

	public void searchFor(String text) {
		write(eleGoogle.getInputSearchBarGoogle(), text);
		click(eleGoogle.getBtnSearchGoogle());
	}

	public void navigateTo(String url) {
		if(!url.matches("[http{s}://]+")) {
			url="https://"+url+"/";
		}
		clickJavascript(eleGoogle.getLinkOfUrl(url));
		
	}
	
}
