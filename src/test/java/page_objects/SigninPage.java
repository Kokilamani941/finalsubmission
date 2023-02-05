package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage {

	
private static SigninPage loginPageInstance;
	
	//Dummy private constructor prevents the object creation
	public SigninPage() {
		
	}
	
	//this method prevents second object creation for the same type, Singleton pattern lazy loading
	public static SigninPage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new SigninPage();		
		}
		
		return loginPageInstance;
			
	}		
	
	@FindBy (id="id_username")
	private WebElement txt_username;
	
	@FindBy (id="id_password")
	private WebElement txt_password;
	
	@FindBy (xpath="//input[@value=\"Login\"]")
	private WebElement lin_login;
	
	public void Enterusername(String Uname) {
		txt_username.sendKeys(Uname);
	}
	
	public void Enterpassword(String Upassword) {
		txt_password.sendKeys(Upassword);	
	}
	
	public void Textbox_Clear()
	{
		txt_username.clear();
		txt_password.clear();
	}
	
	public void clicklogin() {
		lin_login.click();
	}
	
	public void Signin(String strUsr, String strPwd)
	{
		txt_username.sendKeys(strUsr);
		txt_password.sendKeys(strPwd);
		lin_login.click();		
	}
	
	
}
