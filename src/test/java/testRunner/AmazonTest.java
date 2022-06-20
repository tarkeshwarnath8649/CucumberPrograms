package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/featureFiles/HooksScenario.feature"},
		glue = {"stepDefinitions","MyHooks"},
		plugin = {"pretty",
				   "json: target/MyReports/report.json",
				   "junit: target/MyReports/report.xml"},
		monochrome = true,
		publish = true
		)

public class AmazonTest {

}
