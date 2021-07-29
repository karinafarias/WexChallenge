package pages;

import elements.ElementsGoogle;
import interation.InteractionWeb;
/**
 * This class contains only methods about search in Google page
 */
public class PageGoogle implements InteractionWeb {
	private ElementsGoogle eleGoogle = new ElementsGoogle();
	
	/**
	 * This method uses the url as parameter, before this this method checks if the url has 
	 * http or https and put it if necessary. It opens the browser with this url.
	 * 
	 * 
	 */
	public void openGoogle(String url) {
		if(!url.matches("[http{s}://]+")) {
			url="https://"+url;
		}
		openUrl(url);
		waitUrlLoading(url, 20);
	}
	/**
	 * This method writes some text in search bar on Google 
	 */
	public void searchFor(String text) {
		write(eleGoogle.getInputSearchBarGoogle(), text);
		click(eleGoogle.getBtnSearchGoogle());
	}

	/**
	 * This method looking for Amazon url and click it on Google search page 
	 */
	public void navigateTo(String url) {
		if(!url.matches("[http{s}://]+")) {
			url="https://"+url+"/";
		}
		click(eleGoogle.getLinkOfUrl(url));
		
	}
	
}
