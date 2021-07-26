package elementos;

import org.openqa.selenium.By;

import interfaces.objects.WebBaseElements;

public class ElementsGoogle  implements WebBaseElements{
	private By inputSearchBarGoogle = name("q");
	private By btnSearchGoogle = name("btnK");
	
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
