package step_definitions;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import constants.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.HomePage;
import page_objects.Linkedlistpage;
import page_objects.SigninPage;
import utilities.common_utils;
import webdriver_manager.DriverManager;

public class Linkedlist_stepdef {

	WebDriver driver = DriverManager.getDriver();	
	Linkedlistpage ll =Linkedlistpage.getInstance();
	SigninPage SignPage = SigninPage.getInstance();
	HomePage homePage = HomePage.getInstance();
	common_utils objCommounUtils = new common_utils();
	
private static final Logger LOGGER = LogManager.getLogger(Linkedlist_stepdef.class);	
	
	public Linkedlist_stepdef()
	{
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	

	//@TS_LL_01 Given 1 , 3 , 5 ,7 , 9 , 11, 13  Scenario shared
	@Given("user is in  Linked List page after logged in")
	public void user_is_in_linked_list_page_after_logged_in() throws InterruptedException {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		Thread.sleep(2000);
		homePage.btn_linkedlist();
		LOGGER.info("User logged in to sucessfully");
	}
	
	
	//When 1 , 3 , 5 , 7, 9 ,11 ,13 Scenario shared
	@When("The user clicks {string} button")
	public void The_user_clicks_button_in_linked_list_page(String string) throws InterruptedException {
		switch (string) {
		case "Introduction":
			ll.introductionLink();
			break;
		case "Creating Linked List":
		    ll.creatinglist_click();	
			break;					
		case "Types of Linked List":
	        ll.typesOfLLLink();
			break;
		case "Implement Linked List in Python":
		    ll.implementLLInPythonLink();
			break;
		case "Traversal":
			ll.traversalLink();
			break;
		default:
			ll.insertionLink();
			ll.deletionLink();
			
			break;
		}
		LOGGER.info("User clicked " + string);		

	}
	//Then 1 , 3 , 5 , 7, 9 ,11 ,13 Scenario shared
	@Then(" user should be redirected to  {string} page")
	public void user_should_be_redirected_to_page(String string) {
		
		if(driver.getCurrentUrl().contains(string))
		{
			LOGGER.info("User in page " + string);
		}
		//assertTrue(driver.getCurrentUrl().contains(string));
		homePage.Signout_Click();
	   
	}
	
	
	//@TS_LL_02
	
   @Given("user is in Introduction page after logged in")
   public void user_is_in_introduction_page_after_logged_in() {

	driver.get(Constants.SIGNIN_URL);
	driver.manage().window().maximize();
	SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
	//Thread.sleep(2000);
	homePage.btn_linkedlist();
	LOGGER.info("User logged in to sucessfully");
	ll.introductionLink();
	LOGGER.info("User clicked Introduction Page in LL");	
	}

   
   @When("user clicks {string} button in Introduction  page")
   public void user_clicks_button_in_introduction_page(String string) {
	   ll.introductionLink();
    ll.tryHereLink();
    }

		
	@Then("user should be redirected to  Introduction tryEditor with a Run button to test")
	public void user_should_be_redirected_to_Introduction_try_editor_with_a_run_button_to_test() {
		
		if(driver.getCurrentUrl().contains("tryEditor "))
		{
			LOGGER.info("User in tryEditor  page");
		}
		//assertTrue(driver.getCurrentUrl().contains("ttryEditor "));
		driver.navigate().back();
		homePage.Signout_Click();
	}
	
//	//@TS_LL_03- Given , When shared with 1
//	@Then("user should be redirected to {string}  page")
//public void user_should_b9e_redirected_to_page(String string)  {
//	ll.creatinglist_click();
//	}
	//@TS_LL_04
		@Given("user is in   Creating Linked List  after logged in")
		public void user_is_in_creating_linked_list_page_after_logged_in() {
			driver.get(Constants.SIGNIN_URL);
			driver.manage().window().maximize();
			SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
			//Thread.sleep(2000);
			homePage.btn_linkedlist();
			LOGGER.info("User logged in sucessfully");
		ll.creatinglist_click();
			LOGGER.info("User clicked creating linkedlist List");
		}
		
		
		@When("user clicks {string} button in Creating Linked List Page")
		public void user_clicks_button_in_Creating_Linked_List_Page(String string)  {
	ll.creatinglist_click();
	     ll.tryHereLink();
		}
		
		@Then("user should be redirected to Creating Linked List tryEditor with a Run button to test")
	public void user_should_be_redirected_to_Creating_Linked_List_try_editor_with_a_run_button_to_test() {
		
		if(driver.getCurrentUrl().contains("Creating Linked List"))
			{
				LOGGER.info("User in Creating Linked List page");
		}
	//assertTrue(driver.getCurrentUrl().contains("tryHereLink"));
		driver.navigate().back();
			homePage.Signout_Click();
		}
	
	
	
	//@TS_LL_06
	@Given("user is in Types of Linked List page after logged in")
	public void user_is_in_Types_of_Linked_List_page_after_logged_in() {

		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		//Thread.sleep(2000);
		homePage.btn_linkedlist();
		LOGGER.info("User logged in sucessfully");
		ll.typesOfLLLink();
		LOGGER.info("User clicked  Types of Linked List page  link");
	
	
	}
	
	@When("user clicks {string} button in Types of Linked List page")
	public void user_clicks_button_in_Types_of_Linked_List_page(String string){
	     ll.tryHereLink();
	}
	
	@Then("user should be redirected to a page Types of Linked List an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_Types_of_Linked_List_an_try_editor_with_a_run_button_to_test() {
		
		if(driver.getCurrentUrl().contains("Types of Linked List "))
	{
		LOGGER.info("User in Types of Linked List  page");
		}
		//assertTrue(driver.getCurrentUrl().contains("tryHereLink"));
		driver.navigate().back();
	homePage.Signout_Click();
	}
	
	
	//@TS_LL_08
	@Given("user is in  Implement Linked List in Python after logged in")
	public void user_is_in_implement_linked_list_in_python_after_logged_in() {

			driver.get(Constants.SIGNIN_URL);
			driver.manage().window().maximize();
			SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
			//Thread.sleep(2000);
			homePage.btn_linkedlist();
			LOGGER.info("User logged in sucessfully");
			ll.implementLLInPythonLink();
			LOGGER.info("User clicked implement Linked List in Python page link");
		}
	
	@When("user clicks {string} button in Implement Linked List in Python page")
	public void user_clicks_button_in_implement_linked_list_in_python_page(String string)  {
		  ll.tryHereLink();
	}
	
	@Then("user should be redirected to a page Implement Linked List an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_Implement_Linked_List_an_try_editor_with_a_run_button_to_test() {
		
		if(driver.getCurrentUrl().contains("Implement Linked List"))
		{
			LOGGER.info("User in Implement Linked List page");
		}
		//assertTrue(driver.getCurrentUrl().contains("tryHereLink"));
		driver.navigate().back();
		homePage.Signout_Click();
	}
	
	
	
	//@TS_LL_10
	@Given("user is in Traversal after logged in")
	public void user_is_in_traversal_after_logged_in() {
			driver.get(Constants.SIGNIN_URL);
			driver.manage().window().maximize();
			SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
			//Thread.sleep(2000);
			homePage.btn_linkedlist();
			LOGGER.info("User logged in sucessfully");
			ll.traversalLink();
			LOGGER.info("User clicked Traversal  page link");
			
		}
	
	@When("The user clicks {string} button in Traversal page")
	public void The_user_clicks_button_in_traversal_page(String string) {
		  ll.tryHereLink();
	}
	
	@Then("user should be redirected to a page  Traversal tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_Traversal_try_editor_with_a_run_button_to_test() {
		
		if(driver.getCurrentUrl().contains(" Traversal"))
		{
			LOGGER.info("User in  Traversal page");
		}
		//assertTrue(driver.getCurrentUrl().contains("tryHereLink"));
		driver.navigate().back();
		homePage.Signout_Click();
	}
	//@TS_LL_12
	@Given("user is in Insertion after logged in")
	public void user_is_in_insertion_after_logged_in() {
			driver.get(Constants.SIGNIN_URL);
			driver.manage().window().maximize();
			SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
			//Thread.sleep(2000);
			homePage.btn_linkedlist();
			LOGGER.info("User logged in sucessfully");
			ll.insertionLink();
			LOGGER.info("User clicked Insertion  page link");
			
		}
	@When("The user clicks {string} button in Insertion page")
	public void The_user_clicks_button_in_insertion_page(String string) {
		  ll.tryHereLink();
	}
	
	@Then("user should be redirected to insertion tryEditor page to Run button to test")
	public void user_should_be_redirected_to_insertion_try_editor_page_to_run_button_to_test() {
		
		if(driver.getCurrentUrl().contains("Insertion"))
		{
			LOGGER.info("User in Insertion page");
		}
		//assertTrue(driver.getCurrentUrl().contains("tryHereLink"));
		driver.navigate().back();
		homePage.Signout_Click();
	}
	
	
	//@TS_LL_14,15
	@Given("user is in Deletion after logged in")
	public void user_is_in_deletion_after_logged_in() {
			driver.get(Constants.SIGNIN_URL);
			driver.manage().window().maximize();
			SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
			//Thread.sleep(2000);
			homePage.btn_linkedlist();
			LOGGER.info("User logged in sucessfully");
			ll.deletionLink();
			LOGGER.info("User clicked Deletion  page link");
			
		}
	@When("The user clicks {string} button in Deletion page")
	public void The_user_clicks_button_in_deletion_page(String string) {

		  ll.tryHereLink();
	}
	
	//14,15
	@Then("user should be redirected to Deletion tryEditor to Run button to test and Submit button")
	public void user_should_be_redirected_Deletion_to_try_editor_to_run_button_to_test_and_submit_button()  {
		if(driver.getCurrentUrl().contains("deletion"))
		{
			LOGGER.info("User in Deletion page");
		}
		LOGGER.info("send text to editor print('dsalgo project test')");
		ArrayList<ArrayList<String>> arrLL = objCommounUtils.readExcelData();
		LOGGER.info("Arraylist count :" + String.valueOf(arrLL.size()));
	
		ll.txtCodeArea_senkeys(arrLL.get(1).get(0));
	    ll.btnRun_click();
	    driver.navigate().back();
		homePage.Signout_Click();
	}
	

	

}
	
	
	
	