package pages;

import org.openqa.selenium.By;

import config.WebDriverConfig;

public class HomePage extends WebDriverConfig {
	By registerLink = By.xpath("//td[@class='mouseOut']/a[@href='register.php']");
	
	public HomePage() {
		super();
	}

	public void clickOnRegisterLink() {

		driver.findElement(registerLink).click();
	}

}
