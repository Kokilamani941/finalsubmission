package step_definitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.ArrayPage;
import page_objects.HomePage;
import page_objects.SigninPage;
import utilities.common_utils;
import webdriver_manager.DriverManager;

public class Array_Stepdef {
	
	WebDriver driver = DriverManager.getDriver();	
	ArrayPage arrayPage = ArrayPage.getInstance();
	SigninPage SignPage = SigninPage.getInstance();
	HomePage homePage = HomePage.getInstance();
	common_utils objCommounUtils = new common_utils();
	
	private static final Logger LOGGER = LogManager.getLogger(Array_Stepdef.class);	
	
	public Array_Stepdef()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	//@TestSuit_Array_01 Given 1 , 3 , 5 ,7 , 9 Scenario shared
	@Given("user is in  Array page after logged in")
	public void user_is_in_array_page_after_logged_in() throws InterruptedException {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		Thread.sleep(2000);
		homePage.btnArrayGetstarted_Click();
		LOGGER.info("User logged in sucessfully");		
	}
	
	//When 1 , 3 , 5 , 7 Scenario shared
	@When("user clicks {string} button")
	public void user_clicks_button(String string) {
		switch (string) {
		case "Arrays in Python":
			arrayPage.lnkArraysNpython_click();
			break;
		case "Arrays using List":
			arrayPage.lnkArraysUlist_click();	
			break;					
		case "Basic Operations in List":
			arrayPage.lnkBasicOperationsList_click();
			break;
		case "Applications of Array":
			arrayPage.lnkApplicationArray_Click();
			break;
		default:
			arrayPage.lnkArraysNpython_click();
			arrayPage.lnkPracticeQuestions_click();
			break;
		}
		LOGGER.info("User clicked " + string);		
	}

	//Then 1 , 3 , 5 , 7 Scenario shared
	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
		if(driver.getCurrentUrl().contains(string))
		{
			LOGGER.info("User in page " + string);
		}
		assertTrue(driver.getCurrentUrl().contains(string));
		homePage.Signout_Click();
	}

	//@TestSuit_Array_02
	@Given("user is in  Arrays in Python page after logged in")
	public void user_is_in_arrays_in_python_page_after_logged_in() {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		//Thread.sleep(2000);
		homePage.btnArrayGetstarted_Click();
		LOGGER.info("User logged in sucessfully");
		arrayPage.lnkArraysNpython_click();
		LOGGER.info("User clicked Arrays in Python");		
	}

	@When("user clicks {string} button in Arrays in Python page")
	public void user_clicks_button_in_arrays_in_python_page(String string) {
	    arrayPage.lnkTryhere();
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		if(driver.getCurrentUrl().contains("tryEditor"))
		{
			LOGGER.info("User in tryEditor page");
		}
		assertTrue(driver.getCurrentUrl().contains("tryEditor"));
		driver.navigate().back();
		homePage.Signout_Click();
	}
	
	//@TestSuit_Array_03- Given , When shared with 1
	@Then("user should b9e redirected to {string} page")
	public void user_should_b9e_redirected_to_page(String string) {
	    arrayPage.lnkArraysUlist_click();
	}

	//@TestSuit_Array_04
	@Given("user is in  Arrays using List page after logged in")
	public void user_is_in_arrays_using_list_page_after_logged_in() {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		//Thread.sleep(2000);
		homePage.btnArrayGetstarted_Click();
		LOGGER.info("User logged in sucessfully");
		arrayPage.lnkArraysUlist_click();
		LOGGER.info("User clicked Arrays using List");
	}

	@When("user clicks {string} button in Arrays using List page")
	public void user_clicks_button_in_arrays_using_list_page(String string) {
		arrayPage.lnkTryhere();
	}
	
	//@TestSuit_Array_06
	@Given("user is in  Basic Operations in List page after logged in")
	public void user_is_in_basic_operations_in_list_page_after_logged_in() {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		//Thread.sleep(2000);
		homePage.btnArrayGetstarted_Click();
		LOGGER.info("User logged in sucessfully");
		arrayPage.lnkBasicOperationsList_click();
		LOGGER.info("User clicked Basic Operations in List page link");
	}

	//@TestSuit_Array_08
	@Given("user is in  Applications of Array page after logged in")
	public void user_is_in_applications_of_array_page_after_logged_in() {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		//Thread.sleep(2000);
		homePage.btnArrayGetstarted_Click();
		LOGGER.info("User logged in sucessfully");
		arrayPage.lnkApplicationArray_Click();
		LOGGER.info("User clicked Applications of Array page link");
	}

	@When("user clicks {string} button in Applications of Arrays page")
	public void user_clicks_button_in_applications_of_arrays_page(String string) {
		arrayPage.lnkTryhere();
	}

	//@TestSuit_Array_10
	@Given("user is in  Practice page")
	public void user_is_in_practice_page() {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
		//Thread.sleep(2000);
		homePage.btnArrayGetstarted_Click();
		LOGGER.info("User logged in sucessfully");
		arrayPage.lnkApplicationArray_Click();
		LOGGER.info("User clicked Applications of Array page link");
		arrayPage.lnkPracticeQuestions_click();
		LOGGER.info("User clicked practice question page");
	}

	@When("user clicks {string} link")
	public void user_clicks_link(String string) {
		switch (string) {
		case "Search the array":
			arrayPage.lnkSearchArry_click();
			break;
		case "Max Consecutive Ones":
			arrayPage.lnkMaxconsecutive_click();	
			break;					
		case "Find Numbers with Even Number of Digits":
			arrayPage.lnkFindNumbers_click();
			break;
		case "Squares of a Sorted Array":
			arrayPage.lnkSquaresSortedArray_click();
			break;
		default:
			break;
		}
		LOGGER.info("User clicked " + string + " link");
	}

//	@Then("user should be redirected to {string} page contains a question,an tryEditor with Run and Submit buttons")
//	public void user_should_be_redirected_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("user should be redirected to {string} page contains questions,an tryEditor  to write code with Run and Submit buttons")
	public void user_should_be_redirected_to_page_contains_questions_an_try_editor_to_write_code_with_run_and_submit_buttons(String string) {
		if(driver.getCurrentUrl().contains("question"))
		{
			LOGGER.info("User in question page");
		}
		LOGGER.info("send text to editor print('dsalgo project test')");
		ArrayList<ArrayList<String>> arrLL = objCommounUtils.readExcelData();
		LOGGER.info("Arraylist count :" + String.valueOf(arrLL.size()));
		arrayPage.txtCodeArea_senkeys(arrLL.get(1).get(0));
		arrayPage.btnRun_click();
		//assertTrue(driver.getCurrentUrl().contains("tryEditor"));
		//assertTrue(arrayPage.lblOutput_getText().contains("dsalgo project test"));		
	}

//	@When("user clicks {string} link")
//	public void user_clicks_link(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
