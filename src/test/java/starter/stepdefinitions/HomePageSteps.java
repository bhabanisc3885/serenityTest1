package starter.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import starter.pageobjects.HomePage;

public class HomePageSteps {
	
	@Steps
	HomePage homePage;
	
	@Managed
	WebDriver driver;
	
	@Given("The user opens the Internet site")
	public void the_user_opens_the_internet_site() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@When("The user clicks on Basic Auth link")
	public void the_user_clicks_on_basic_auth_link() throws InterruptedException {
		homePage.clickOnBasicAuthLink();
	}

}
