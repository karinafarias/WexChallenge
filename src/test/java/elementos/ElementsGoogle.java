package elementos;

import org.openqa.selenium.By;

public class ElementsGoogle {
	private By inputSearchBarGoogle = By.name("q");
	private By btnSearchGoogle = By.name("btnK");
	
	public By getLinkOfUrl(String url) {
		return By.xpath("//link/..//a[@href='"+url+"']");
	}

	public By getInputSearchBarGoogle() {
		return inputSearchBarGoogle;
	}
	
	public By getBtnSearchGoogle() {
		return btnSearchGoogle;
	}
	
}
