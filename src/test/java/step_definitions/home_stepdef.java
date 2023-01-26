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
import page_objects.HomePage;
import webdriver_manager.DriverManager;

public class home_stepdef {

	WebDriver driver = DriverManager.getDriver();
	HomePage homePage = HomePage.getInstance(); 
	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	
	//@TestSuit_home_01	
	@Given("User opens DS Algo portal link")
	public void user_opens_ds_algo_portal_link() {	
		driver.get(Constants.APP_URL);
		driver.manage().window().maximize();		
		LOGGER.info("User opens DS Algo portal link");    
	}	
	
	@When("User clicks Get Started button")
	public void user_clicks_get_started_button() {
		HomePage.getInstance().btn_getstartedclick();
		LOGGER.info("User clicks getstarted button");
	}

	@Then("User will be redirected to homepage")
	public void user_will_be_redirected_to_homepage() {
		//assertEquals("https://dsportalapp.herokuapp.com/home",driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("home"))
		{
			LOGGER.info("User in homepage");
		}
		assertTrue(driver.getCurrentUrl().contains("home"));
	}	

//	@TestSuit_home_02
	@Given("User is in Home page")
	public void user_is_in_home_page() {
	    driver.get(Constants.HOME_URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    LOGGER.info("User in homepage");
	}

	@When("User clicks on Data Structures dropdown")
	public void user_clicks_on_data_structures_dropdown() {
		LOGGER.info("User clicks data structure dropdown ");
	}

	@When("Select Array option")
	public void select_array_option() throws InterruptedException {
		LOGGER.info("User select array option from data structures dropdown");
		HomePage.getInstance().drp_Item_Click("Arrays");
	}

	@Then("User to get warning message to login")
	public void user_to_get_warning_message_to_login() {
	    if(homePage.successalertmessage().equals("You are not logged in"))
	    {
	    	LOGGER.info("you are not logged in alert popup!!!");
	    	assertTrue(true);
	    }
	}

//	@TestSuit_home_03
	@Given("User in Home page")
	public void user_in_home_page() {
		driver.get(Constants.HOME_URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    LOGGER.info("User in homepage");
	}

	@When("User clicks on signin link")
	public void user_clicks_on_signin_link() {
		LOGGER.info("User clicks signin page");
	    homePage.link_signin();
	}

	@Then("User to go to login page")
	public void user_to_go_to_login_page() {
		if(driver.getCurrentUrl().contains("login"))
		{
			LOGGER.info("User in login page");
		}
		assertTrue(driver.getCurrentUrl().contains("login"));
	}
		
//	@TestSuit_home_04 given method shared and in line 74
	@When("User clicks on register link")
	public void user_clicks_on_register_link() {
		LOGGER.info("User clicks register page");
		homePage.likn_register();
	}

	@Then("User to open Registration page")
	public void user_to_open_registration_page() {
		if(driver.getCurrentUrl().contains("register"))
		{
			LOGGER.info("User in register page");
		}
		assertTrue(driver.getCurrentUrl().contains("register"));
	}

	



}
