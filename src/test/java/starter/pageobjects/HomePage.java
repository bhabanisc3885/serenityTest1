package starter.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.cleartrip.com/")
public class HomePage extends PageObject {
	
	@FindBy(xpath="//*[contains(text(),'Basic Auth')]")
	public WebElementFacade basicAuth;

	public void clickOnBasicAuthLink() throws InterruptedException {
		basicAuth.click();
		Thread.sleep(1000);
	}
	
	

}
