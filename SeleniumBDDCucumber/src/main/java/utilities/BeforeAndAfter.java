package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;

import config.WebDriverConfig;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAndAfter {
	@Before
	public void setup() throws Throwable {
		WebDriverConfig.initialization();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.getStatus().equalsIgnoreCase("failed")) {
			try {
				File scrFile = CommonFunctions.takeSnapShot(WebDriverConfig.driver);
				byte[] data = FileUtils.readFileToByteArray(scrFile);
				scenario.embed(data, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		WebDriverConfig.driver.close();
		WebDriverConfig.driver.quit();
	}

}
