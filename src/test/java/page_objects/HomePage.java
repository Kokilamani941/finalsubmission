package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

private static HomePage loginPageInstance;
	
	//Dummy private constructor prevents the object create
	private HomePage() {
		
	}
	
	//this method prevents duplicate object creation, Singleton pattern lazy loading
	public static HomePage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new HomePage();		
		}
		
		return loginPageInstance;
		
	}
		
	
	@FindBy(className="btn") 
	private WebElement btngetstarted;
	
	public void btn_getstartedclick() {
		
		btngetstarted.click();
		
	}
	
	//@FindBy(className="dropdown")
	//private WebElement drpdowntoggle;
	
	
	
}
