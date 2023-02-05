package page_objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import webdriver_manager.DriverManager;

public class ArrayPage {
	
	
	private static ArrayPage loginPageInstance;
	
	//Dummy private constructor prevents the object creation
	private ArrayPage() {
		
	}
	
	//this method prevents second object creation for the same type, Singleton pattern lazy loading
	public static ArrayPage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new ArrayPage();		
		}		
		return loginPageInstance;		
	}
		
	@FindBy(linkText = "Arrays in Python")WebElement lnkArraysNpython;
	@FindBy(linkText = "Arrays Using List")WebElement lnkArraysUlist;
	@FindBy(linkText = "Basic Operations in Lists")WebElement lnkBasicOperationsList;
	@FindBy(linkText = "Applications of Array")WebElement lnkApplicationArray;
	@FindBy(linkText = "Practice Questions")WebElement lnkPracticeQuestions;
	
	@FindBy(linkText = "Search the array")WebElement lnkSearchArry;
	@FindBy(linkText = "Max Consecutive Ones")WebElement lnkMaxconsecutive;
	@FindBy(linkText = "Find Numbers with Even Number of Digits")WebElement lnkFindNumbers;
	@FindBy(linkText = "Squares of  a Sorted Array")WebElement lnkSquaresSortedArray;
	
	//Question page
	@FindBy(xpath = "//button[text()='Run']")WebElement btnRun;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement txtCodeArea;
	@FindBy(xpath = "//pre[@id='output']")WebElement lblOutput;
	
		
	@FindBy(linkText = "Try here>>>")WebElement lnkTryhere;
	
	public void lnkTryhere()
	{
		Actions actionTry = new Actions(DriverManager.getDriver());
		actionTry.scrollToElement(lnkTryhere).click(lnkTryhere);
		actionTry.perform();
	}
	
	public void btnRun_click() {
		btnRun.click();
	}
	
	public String lblOutput_getText() {
		return lblOutput.getText();
	}
	
	public void txtCodeArea_senkeys(String strValue) {
		txtCodeArea.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		txtCodeArea.sendKeys(strValue);
	}
	
	public void lnkSearchArry_click() {
		lnkSearchArry.click();
	}
	
	public void lnkMaxconsecutive_click() {
		lnkSearchArry.click();
	}
	
	public void lnkFindNumbers_click() {
		lnkSearchArry.click();
	}
	
	public void lnkSquaresSortedArray_click() {
		lnkSearchArry.click();
	}
	
	public void lnkPracticeQuestions_click() {
		lnkPracticeQuestions.click();
	}
	
	public void lnkArraysNpython_click()
	{
		lnkArraysNpython.click();
	}
	
	public void lnkArraysUlist_click()
	{
		lnkArraysUlist.click();
	}
	
	public void lnkBasicOperationsList_click()
	{
		lnkBasicOperationsList.click();
	}
	
	public void lnkApplicationArray_Click()
	{
		lnkApplicationArray.click();
	}
	
	
	

}
