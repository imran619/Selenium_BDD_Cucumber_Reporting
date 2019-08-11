package steps;

import JSONRead.JSONReader;
import config.WebDriverConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;

public class RegisterPageSteps extends WebDriverConfig {
	HomePage _homePage;
	JSONReader jsonRead = new JSONReader();

	@Given("^I go to home page of New Tours$")
	public void i_go_to_home_page_of_New_Tours() throws Throwable {
		driver.get(jsonRead.jsonRead(".\\Data\\data.json", "URL"));
		System.out.println("Navigate to home page");
	}

	@When("^I Click on the Register link$")
	public void clickOnTheRegisterPink() throws Throwable {
		
		_homePage = new HomePage();
		_homePage.clickOnRegisterLink();
	}

	@Then("^I am in Register page$")
	public void onRegisterPage() throws Throwable {
		System.out.println("I am in register page....!!!!!");

	}

}
