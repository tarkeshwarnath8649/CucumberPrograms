package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationAsListsStep {
	

@Given("User navigates to Registartion page")
public void user_navigates_to_registartion_page() {
	System.out.println("Step1: User is navigated to the Registration page");
}

@When("User enter below user details")
public void user_enter_below_user_details(DataTable dataTable) {
	
	List<List<String>> userLists = dataTable.asLists(String.class);
	
	for(List<String> u : userLists) {
		System.out.println(u);
	}
}

@Then("user is successfully registered")
public void user_is_successfully_registered() {
	System.out.println("Step3: User is successfully registered");
}

}
