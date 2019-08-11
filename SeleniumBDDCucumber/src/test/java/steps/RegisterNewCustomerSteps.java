package steps;

import static org.testng.Assert.assertEquals;

import JSONRead.JSONReader;
import config.WebDriverConfig;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterNewCustomerSteps extends WebDriverConfig {
	HomePage _homePage;
	RegisterPage _registerPage;
	ConfirmationPage _confirmationPage;
	JSONReader jsonRead = new JSONReader();

	@Given("^I Navigate to New Tours website$")
	public void navigateToNewToursWebsite() throws Throwable {
		driver.get(jsonRead.jsonRead(".\\Data\\data.json", "URL"));
	}

	@And("^Click on 'REGISTER' link$")
	public void clickOnRegisterLink() throws Throwable {
		_homePage = new HomePage();
		_homePage.clickOnRegisterLink();
	}

	@When("^I complete all the form details$")
	public void completeAllTheFormDetails() throws Throwable {
		_registerPage = new RegisterPage();
		_registerPage.enterNewCustomerDetails();
	}

	@And("^I click on 'Submit' button$")
	public void i_click_on_Submit_button() throws Throwable {
		_registerPage.clickOnSubmitButton();
	}

	@Then("^I am navigated to the confirmation page$")
	public void navigatedToTheConfirmationPage() throws Throwable {
		_confirmationPage = new ConfirmationPage();
		try {
			assertEquals(_confirmationPage.confirmationMessage(),
					"Note: Your user name is " + jsonRead.jsonRead(".\\Data\\data.json", "USER_NAME") + ".");
		} catch (AssertionError err) {
			
			throw err;
		}
	}
}
