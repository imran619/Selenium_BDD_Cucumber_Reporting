package pages;

import org.openqa.selenium.By;
import config.WebDriverConfig;

public class ConfirmationPage extends WebDriverConfig {

	By message = By.xpath("//p[3]/font/b");

	public ConfirmationPage() {

		super();
	}

	public String confirmationMessage() {

		return driver.findElement(message).getText().toString();
	}

}
