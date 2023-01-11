package step_definitions;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webdriver_manager.DriverManager;

public class home_stepdef {

	@Given("User opens DS Algo portal link")
	public void user_opens_ds_algo_portal_link() {
	
		DriverManager.getDriver().get(Constants.APP_URL);
		DriverManager.getDriver().manage().window().maximize();
		
		System.out.println("User opens DS Algo portal link");    
	}

	@When("User clicks {string} button")
	public void user_clicks_button(String string) {
		System.out.println("User clicks button");   
	}

	@Then("User will be redirected to homepage")
	public void user_will_be_redirected_to_homepage() {
		System.out.println("User will be redirected to homepage");   
	}

	
	@Given("User is in Home page")
	public void user_is_in_home_page() {
		System.out.println("User is in Home page");   
	}

	@When("User clicks on dropdown {string}")
	public void user_clicks_on_dropdown(String string) {
		System.out.println("User clicks on dropdown");  
	}

	@When("Select Array option")
	public void select_array_option() {
	System.out.println("Select Array option");    
	    
	}

	@Then("User to get warning message {string}")
	public void user_to_get_warning_message(String string) {
		System.out.println("User to get warning message ");   
	}

	@When("User clicks on Get Started link on homepage {string} -  without logging")
	public void user_clicks_on_get_started_link_on_homepage_without_logging(String string) {
		System.out.println("Select Array option\"User clicks on Get Started link on homepage");   
	}

	@Given("User in Home page")
	public void user_in_home_page() {
		System.out.println("User in Home page");   
	}

	@When("User clicks on signin link")
	public void user_clicks_on_signin_link() {
		System.out.println("User clicks on signin link"); 
	}

	@Then("User to go to login page")
	public void user_to_go_to_login_page() {
		System.out.println("User to go to login page");   
	}

	@When("User clicks on register link")
	public void user_clicks_on_register_link() {
		System.out.println("User clicks on register link");  
	}

	@Then("User to open Registration page")
	public void user_to_open_registration_page() {
		System.out.println("User to open Registration page");
	}



}
