package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage {
	
private static Registerpage loginPageInstance;
	
	//Dummy private constructor prevents the object creation
	public Registerpage() {
		
	}
	
	//this method prevents second object creation for the same type, Singleton pattern lazy loading
	public static Registerpage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new Registerpage();		
		}
		
		return loginPageInstance;
		
	}		

	
	@FindBy(id="id_username")
	private WebElement txt_username;
	
	@FindBy(id="id_password1")
	private WebElement txt_password;
	
	@FindBy(id="id_password2")
	private WebElement txt_confpassword;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement btn_register;

	public void enterusername(String strname) {
		
		txt_username.sendKeys(strname);
	}
	
	public void enterpassword(String strpassword) {
		txt_password.sendKeys(strpassword);
	}
	
	public void enterconfpassword(String strConfpassword) {
		txt_confpassword.sendKeys(strConfpassword);
	}
	
	public void clickregister() {
		btn_register.click();	
	}

}
