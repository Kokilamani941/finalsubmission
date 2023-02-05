package step_definitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.SigninPage;
import webdriver_manager.DriverManager;

public class Signin_stepdef {

	WebDriver driver = DriverManager.getDriver();	
	SigninPage SignPage = SigninPage.getInstance();
	private static final Logger LOGGER = LogManager.getLogger(Signin_stepdef.class);
	
	public void LoadLoginPage()
	{
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LOGGER.info("User in signin page");	
	}
	
	//@Test_suit_signin01	
	@Given("User is in sigin page regone")
	public void user_is_in_sigin_page_regone() {
		LOGGER.info("Test_suit_signin01");
		LoadLoginPage();			
	}
 
	@When("User not giving valid userId regone")
	public void user_not_giving_valid_user_id_regone() {
		SignPage.Enterusername("xx");
		LOGGER.info("User entered xx as username");
	}
	
	@When("User not giving valid password regone")
	public void user_not_giving_valid_password_regone() {
	  SignPage.Enterpassword("YY");
	  LOGGER.info("User entered YY as pwd");
	}
	
	@When("User clicks on sigin button regone")
	public void user_clicks_on_sigin_button_regone() {
	 SignPage.clicklogin();   
	 LOGGER.info("User clicks on sigin button");
	}
	
	@Then("Error message displayed regone")
	public void error_message_displayed_regtwo() {
	    System.out.println("Enter valid Userid and password");
	    //assertTrue(driver.getCurrentUrl().contains(string));
	}
	//@Test_suit_signin02
	
	@Given("User is in signin page regtwo")
	public void user_is_in_signin_page_regtwo() {
		LOGGER.info("Test_suit_signin02");
		LoadLoginPage();
		SignPage.Enterusername("Majesty@$56"); 
		LOGGER.info("User is in signin page");
	}
	
	@When("User giving valid password regtwo")
	public void user_giving_valid_password_regtwo() {
		SignPage.Enterpassword("Majesty@123"); 
		LOGGER.info("User giving valid password");
	}
	
	@When("User clicks on sigin button regtwo")
	public void user_clicks_on_sigin_button_regtwo() {
	    SignPage.clicklogin();
	    LOGGER.info("User clicks on sigin button");
	}
	
	@Then("Error no special characters and numbers allowed regtwo")
	public void error_no_special_characters_and_numbers_allowed_regtwo() {
	    
	    LOGGER.info("Error no special characters and numbers allowed");
	}
	
	
	//@Test_suit_signin03
	
	@Given("User is in signin page regthree")
	public void user_is_in_signin_page_regthree() {
		LOGGER.info("Test_suit_signin03");
		LoadLoginPage();
		SignPage.Enterusername("MajestyPalm1");  
		LOGGER.info("User is in signin page");
	}
	
	@When("User not giving valid password regthree")
	public void user_not_giving_valid_password_regthree() {
		SignPage.Enterpassword("majesty"); 
		LOGGER.info("User clicks on sigin button");
	}
	
	@When("User clicks on signin button regthree")
	public void user_clicks_on_signin_button_regthree() {
		SignPage.clicklogin();
		LOGGER.info("User clicks on sigin button");
	}
	@Then("Error message displayed regthree")
	public void error_message_displayed_regthree() {
	    System.out.println("Enter valid password");
	    LOGGER.info("User clicks on sigin button");
	
	}
	//@Test_suit_signin04
	
	@Given("User is in signin page regfive")
	public void user_is_in_signin_page_regfive() {
		LOGGER.info("Test_suit_signin04");
		LoadLoginPage();
		SignPage.Enterusername("MajestyPalm1");
		LOGGER.info("User is in signin page");
	}
	
	@When("User to give valid password regfive")
	public void user_to_give_valid_password_regfive() {
		SignPage.Enterpassword("Majesty@123");
		LOGGER.info("User to give valid password");
	}
	
	@When("User clicks on signin button regfive")
	public void user_clicks_on_signin_button_regfive() {
		SignPage.clicklogin(); 
		LOGGER.info("User clicks on signin button");
	}
	@Then("success message")
	public void success_message() {
	    LOGGER.info("Login successful");
	}
}
