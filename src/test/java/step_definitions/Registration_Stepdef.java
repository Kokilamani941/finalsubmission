package step_definitions;

import org.openqa.selenium.WebDriver;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.Registerpage;
import webdriver_manager.DriverManager;

public class Registration_Stepdef {
	
	WebDriver driver = DriverManager.getDriver();	
	Registerpage RegPage = Registerpage.getInstance();
	
	
	@Given("User is in Register page regone")
	public void user_is_in_register_page_regone() {	   
		driver.get(Constants.REG_URL);
		driver.manage().window().maximize();
	}

	@When("User not giving any valid userId regone")
	public void user_not_giving_any_valid_user_id_regone() {	 
		RegPage.enterusername("xx");
		    
	}

	@When("User not giving valid password and valid password confirmation regone")
	public void user_not_giving_valid_password_and_valid_password_confirmation_regone() {
		RegPage.enterpassword("xy");
		RegPage.enterconfpassword("xz");
	}

	@When("User clicks on Register button regone")
	public void user_clicks_on_register_button_regone() {
	   
		RegPage.clickregister();
	}

	@Then("Error enter valid username & password regone")
	public void error_enter_valid_username_password_regone() {
	  System.out.println("Please enter valid username, password & confirm password"); 
	    
	}

	//@Test_suit_register02
	@Given("User is in Register page regtwo")
	public void user_is_in_register_page_regtwo() {
		driver.get(Constants.REG_URL);
		driver.manage().window().maximize(); 	    
	}

	@When("User not giving valid userId regtwo")
	public void user_not_giving_valid_user_id_regtwo() {	   
	    RegPage.enterusername("x@x");
	}

	@When("User giving valid password and valid password confirmation regtwo")
	public void user_giving_valid_password_and_valid_password_confirmation_regtwo() {
		RegPage.enterpassword("Majesty@123");
		RegPage.enterconfpassword("Majesty@123");	    
	}

	@When("User clicks on Register button regtwo")
	public void user_clicks_on_register_button_regtwo() {
	   RegPage.clickregister();	    
	}

	@Then("Error no special charecters and numbers allowed regtwo")
	public void error_no_special_charecters_and_numbers_allowed_regtwo() {
	   System.out.println("No special charecters and numbers allowed");	    
	}

	//@Test_suit_register03
	@Given("User is in Register page regthree")
	public void user_is_in_register_page_regthree() {
		driver.get(Constants.REG_URL);
		driver.manage().window().maximize(); 	    
	}

	@When("User giving valid userId regthree")
	public void user_giving_valid_user_id_regthree() {
	   RegPage.enterusername("MajestyPalm1");	    
	}

	@When("User not giving valid password and valid password confirmation regthree")
	public void user_not_giving_valid_password_and_valid_password_confirmation_regthree() {
		RegPage.enterpassword("majesty");
		RegPage.enterconfpassword("maje");	    
	}

	@When("User clicks on Register button regthree")
	public void user_clicks_on_register_button_regthree() {
		RegPage.clickregister();	    
	}

	@Then("Error enter valid password regthree")
	public void error_enter_valid_password_regthree() {
	 System.out.println("Please enter valid password and password confirmation"); 	    
	}

	//@Test_suit_register04
	@Given("User is in Register page regfour")
	public void user_is_in_register_page_regfour() {
		driver.get(Constants.REG_URL);
		driver.manage().window().maximize();	    
	}

	@When("User giving valid userId regfour")
	public void user_giving_valid_user_id_regfour() {
		RegPage.enterusername("MajestyPalm1");	    
	}

	@When("User giving valid password and invalid password confirmation regfour")
	public void user_giving_valid_password_and_invalid_password_confirmation_regfour() {
		RegPage.enterpassword("Majesty@123");
		RegPage.enterconfpassword("majesty");	    
	}

	@When("User clicks on Register button regfour")
	public void user_clicks_on_register_button_regfour() {
		RegPage.clickregister();	    
	}

	@Then("Error your confirm password is incorrect regfour")
	public void error_your_confirm_password_is_incorrect_regfour() {
		System.out.println("Confirm password is not matching");	    
	}
	
	//@Test_suit_register05

	@Given("User is in Register page regfive")
	public void user_is_in_register_page_regfive() {
		driver.get(Constants.REG_URL);
		driver.manage().window().maximize();	    
	}

	@When("User to give valid userId regfive")
	public void user_to_give_valid_user_id_regfive() {
		RegPage.enterusername("MajestyPalm1");	    
	}

	@When("User to give valid password and valid password confirmation regfive")
	public void user_to_give_valid_password_and_valid_password_confirmation_regfive() {
		RegPage.enterpassword("Majesty@123");
		RegPage.enterconfpassword("Majesty@123");	    
	}

	@When("User clicks on Register button regfive")
	public void user_clicks_on_register_button_regfive() {
		RegPage.clickregister();	    
	}

	@Then("Validate success message regfive")
	public void validate_success_message_regfive() {
		System.out.println("Successfully registered!");	    
	}

}
