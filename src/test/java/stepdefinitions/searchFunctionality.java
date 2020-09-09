package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learning.learnBDD.AppTest;

public class searchFunctionality extends AppTest{
	
	@Given("launchApp {string}")
	public static void launchapp(String string) {
	    // Write code here that turns the phrase above into concrete actions
		testMethod();
	}

	@When("home page is available")
	public void home_page_is_available() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When home page is available");
	}

	@Then("search the keyword {string}")
	public void search_the_keyword(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("search  "+string);
	}
	
	@Then("Verify the home page UI Elements")
	public void verify_the_home_page_UI_Elements() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verrifying UI elemets in home page");
	}
	

}
