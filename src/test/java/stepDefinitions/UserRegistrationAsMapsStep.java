package stepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationAsMapsStep {
	
	@Given("User navigates to Registartion page As Maps")
	public void user_navigates_to_registartion_page_as_maps() {
	    System.out.println("Step1: Users are navigation to registration page");
	}

	@When("User enter below user details as columns")
	public void user_enter_below_user_details_as_columns(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> userList = dataTable.asMaps(String.class,String.class);
	    
	    System.out.println(userList);
	    Set s = userList.get(0).entrySet();

	    Iterator i = s.iterator();
	    while(i.hasNext()) {
	     System.out.println(i.next());
	    }
	}

	@Then("user is successfully registered as Maps")
	public void user_is_successfully_registered_as_maps() {
	    System.out.println("Step3: Users are successfully registered");
	}

}
