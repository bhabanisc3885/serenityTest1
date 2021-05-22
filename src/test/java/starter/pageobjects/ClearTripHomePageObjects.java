package starter.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ClearTripHomePageObjects extends PageObject {

//	public WebElementFacade from = $(By.id("FromTag"));
//	public WebElementFacade to = $(By.id("ToTag"));
//	public WebElementFacade departDate = $(By.xpath("//input[@title='Depart date']"));
//	public WebElementFacade searchButton = $(By.id("SearchBtn"));
	
	@FindBy(id = "FromTag")
	public WebElementFacade from;
	
	@FindBy(id = "ToTag")
	public WebElementFacade to;
	
	@FindBy(xpath = "//input[@title='Depart date']")
	public WebElementFacade departDate;
	
	@FindBy(id = "SearchBtn")
	public WebElementFacade searchButton;
	
	
	public void enterTextField(WebElementFacade ele, String input) {
		ele.type(input);
	}
	
	public void enterFromCity(String fromCity) {
		//enterTextField(from, "Bangalore");
		from.type(fromCity);
	}
	
	public void enterToCity(String toCity) {
		//enterTextField(to, "Delhi");
		to.type(toCity);
	}
	
	public void search() {
		searchButton.click();
	}

	public void enterDepartDate(String departsOn) {
		//departDate.typeAndEnter("25/05/2021");
		departDate.type(departsOn);
	}
}
