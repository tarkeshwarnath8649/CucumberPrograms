package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	
	@Given("Amazon search page is loaded")
	public void amazon_search_page_is_loaded() {
		System.out.println("Step1: I am on the Search page");
	}

	@When("User enters Product name ={string} and price = {int}")
	public void user_enters_product_name_and_price(String productName, Integer price) {
		System.out.println("Step2: Product Name is: "+productName+" And Price is: "+price);
	}

	@Then("Search result is displayed")
	public void search_result_is_displayed() {
		System.out.println("Search result is displayed");
	}
	
	@Then("Test is passed")
	public void test_is_passed() {
	    System.out.println("Test is Passed");
	}

}
