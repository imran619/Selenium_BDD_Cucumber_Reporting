package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions (
//		plugin = {"pretty", "html:target/cucumber-reports",
//				   "json:target/cucumber-reports/cucumber.json" ,
//				   "junit:target/cucumber-reports/cucumber.xml"},
//		monochrome = true,
//		features = "src/test/features",
//		glue = {"utilities","steps"}
//		)

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/extended-cucumber-reports/cucumber.json", 
		/*retryCount = 3,*/ 
		detailedReport = true, 
		detailedAggregatedReport = true, 
		overviewReport = true,
		coverageReport = true,
		jsonUsageReport = "target/extended-cucumber-reports/cucumber-usage.json", 
		usageReport = true, 
		toPDF = true, 
		outputFolder = "target/extended-cucumber-reports/")
@CucumberOptions(
		plugin = { 
				"html:target/extended-cucumber-reports/cucumber-html-report",
				"json:target/extended-cucumber-reports/cucumber.json",				
		"pretty:target/extended-cucumber-reports/cucumber-pretty.txt",
		"usage:target/extended-cucumber-reports/cucumber-usage.json",
		"junit:target/extended-cucumber-reports/cucumber-results.xml" },
		features = {"src/test/features" }, 
		glue = {"utilities","steps"},
		tags = { "@test"},
		dryRun = false
		)

public class RunnerTest {

}
