package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOrderDetailsStep {
	
	@Given("User navigates to the Login Page")
	public void user_navigates_to_the_login_page() {
		System.out.println("User navigates to the Login Page");
	    
	}

	@When("User enters the Username and Password")
	public void user_enters_the_username_and_password() {
		System.out.println("User enters the username and password");
	}

	@Then("User successfully logs")
	public void user_successfully_logs() {
		System.out.println("User is logged in");
	}

	@Then("User navigates to the Order Details link")
	public void user_navigates_to_the_order_details_link() {
		System.out.println("User navigates to the Order details page");
	}

	@Then("User clicks on the Previous Order Details")
	public void user_clicks_on_the_previous_order_details() {
		System.out.println("User clicks on the previous order details");
	}

	@Then("User clicks on the Current Order Details")
	public void user_clicks_on_the_current_order_details() {
		System.out.println("User clicks on the Current order details");
	}
	
	@Then("User clicks on the Canceled Order Details")
	public void user_clicks_on_the_canceled_order_details() {
		System.out.println("User clicks on the Canceled order details");
	}

}
