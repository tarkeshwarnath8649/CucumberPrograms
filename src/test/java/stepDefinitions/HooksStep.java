package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStep {
	
	@Given("User launches the browser and URl")
	public void user_launches_the_browser_and_u_rl() {
		System.out.println("User launches the browser and URl");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("User enter username and password");
	}

	@Then("User logs in successfully")
	public void user_logs_in_successfully() {
		System.out.println("User logs in successfully");
	}

	@Then("User Clicks on Post and enter something")
	public void user_clicks_on_post_and_enter_something() {
		System.out.println("User clicks on Post and enter something");
	}

	@Then("User click on POST")
	public void user_click_on_post() {
		System.out.println("User click on POST");
	}

}
