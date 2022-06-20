package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineExampleStep {
	
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
		System.out.println("Step1: user Navigates to login page");
	   
	}

	@When("User enters {string} and {string}")
	public void user_enters(String userName,String password) {
	}

	@Then("User logs in to the application")
	public void user_logs_in_to_the_application() {
	}

}
