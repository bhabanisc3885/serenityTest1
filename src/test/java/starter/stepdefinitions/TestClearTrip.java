package starter.stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import starter.steps.ClearTripHomePageSteps;

public class TestClearTrip {

	
	@Steps
	ClearTripHomePageSteps clearTrip;
	
	@Managed
	WebDriver driver;
	
	@Given("The user opens ClearTrip")
	public void the_user_opens_clear_trip() throws InterruptedException {
		//driver.get("https://www.cleartrip.com/");
		clearTrip.openUrl();
		Thread.sleep(2000);
	}

	@When("The user enters the below data and clicks on search")
	public void the_user_enters_the_below_data_and_clicks_on_search(Map<String, String> data) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		clearTrip.enterFromCity(data.get("from"));
		clearTrip.enterToCity(data.get("to"));
		clearTrip.enterDepartDate(data.get("departsOn"));
		Thread.sleep(4000);
		//clearTripHomePageObjects.search();

	}

	@Then("The user should see all the results")
	public void the_user_should_see_all_the_results() {
	    System.out.println("Test need to be configured");
	}
	
	
	@Then("The closes the session")
	public void the_closes_the_session() {
		System.out.println("Test need to be configured");
	}

}
