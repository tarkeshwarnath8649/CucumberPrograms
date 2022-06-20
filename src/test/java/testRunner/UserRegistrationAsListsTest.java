package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/featureFiles/UserRegistrationAsLists.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty",
				   "json: target/MyReports/reports.json",
				   "junit: target/MyReports/reports.xml "
				 },
		publish = true,
		monochrome = true
		
		)
public class UserRegistrationAsListsTest {

}
