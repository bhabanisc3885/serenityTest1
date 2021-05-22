package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pageobjects.ClearTripHomePageObjects;

public class ClearTripHomePageSteps{
	
	ClearTripHomePageObjects clearTripHomePageObjects;
	
	@Step
	public void openUrl() {
		clearTripHomePageObjects.open();
	}

	@Step
	public void enterFromCity(String fromCity) {
		clearTripHomePageObjects.enterFromCity(fromCity);
	}
	
	@Step
	public void enterToCity(String toCity) {
		clearTripHomePageObjects.enterToCity(toCity);
	}
	
	@Step
	public void enterDepartDate(String departsOn) {
		clearTripHomePageObjects.enterDepartDate(departsOn);
	}
	
	@Step
	public void clickSearchBtn() {
		clearTripHomePageObjects.search();
	}
	
	@Step
	public void closeUrl() {
		clearTripHomePageObjects.getDriver().close();
	}
	

}
