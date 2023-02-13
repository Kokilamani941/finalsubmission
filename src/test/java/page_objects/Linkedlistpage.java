package page_objects;


import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

import webdriver_manager.DriverManager;

public class Linkedlistpage {
	
	private static Linkedlistpage loginPageInstance;
	
	public Linkedlistpage() {
		
	}
	
	public static Linkedlistpage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new Linkedlistpage();		
		}		
		return loginPageInstance;		
		
	}

//	@FindBy(linkText = "Get Started")WebElement getStarted;
//	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropDown;

//@FindBy(xpath="//a[@href=\"introduction\"]")WebElement introductionLink;
	
	@FindBy(linkText=("Introduction"))WebElement introductionLink;
	@FindBy(linkText=("Creating Linked LIst"))WebElement creating_linked_list;
	@FindBy (linkText=("Types of Linked List"))WebElement typesOfLLLink; 
	@FindBy(linkText=("Implement Linked List in Python"))WebElement implementLLInPythonLink;
	@FindBy (linkText=("Traversal"))WebElement traversalLink; 
	@FindBy (linkText=("Insertion"))WebElement insertionLink; 
	@FindBy (linkText=("Deletion"))WebElement  deletionLink; 
	@FindBy (linkText=("Practice Questions"))WebElement  practiceQuestionLink; 

//	@FindBy (xpath="//a[@href='creating-linked-list']")WebElement creating_linked_list;
//	
//	@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement implementLLInPythonLink; 
//	@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement typesOfLLLink;  
//	@FindBy (xpath="//a[@href='traversal']")WebElement traversalLink; 
//	@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement insertionLink; 
//	@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement deletionLink; 
//	@FindBy (xpath="//a[@href='/linked-list/practice']")WebElement practiceQuestionLink; 
//
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement editorpythonInput; 

@FindBy(id = "output")WebElement output;
@FindBy(xpath = "//*[@id='answer_form']/button")WebElement runButton;
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryHereLink;
	
	

		
	public void tryHereLink()
	{
		Actions actionTry = new Actions(DriverManager.getDriver());
		actionTry.scrollToElement(tryHereLink).click(tryHereLink);
		actionTry.perform();
	}
		
	public void btnRun_click() {
		runButton.click();
	
	}
	
	public String lblOutput_getText() {
		return output.getText();
	}
	public void txtCodeArea_senkeys(String strValue) {
		editorpythonInput.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		editorpythonInput.sendKeys(strValue);
	}
	
	public void introductionLink() {
		introductionLink.click();
	}
	
	
	public void creatinglist_click() {
		creating_linked_list.click();
	}
	
		
	public void implementLLInPythonLink() {
		implementLLInPythonLink.click();
	}
	
	
	public void typesOfLLLink() {
		typesOfLLLink.click();
	}
	
	
	public void traversalLink() {
		traversalLink.click();
	}
	
	public void  insertionLink() {
		 insertionLink.click();
	}
	
	public void deletionLink() {
		 deletionLink.click();
	}
	
	
	public void  practiceQuestionLink() {
		 practiceQuestionLink.click();
		 
	}
	
	
}