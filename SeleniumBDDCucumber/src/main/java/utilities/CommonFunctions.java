package utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	
	public static File takeSnapShot(WebDriver driver) {
		// Convert web driver object to TakeScreenshot

				TakesScreenshot scrShot = ((TakesScreenshot) driver);

				// Call getScreenshotAs method to create image file

				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
				return SrcFile;
	}

}
