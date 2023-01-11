package utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import page_objects.HomePage;

import webdriver_manager.DriverManager;

public class common_utils {
	
	public void loadproperties() {
		
		
		
		
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Constants.APP_URL = properties.getProperty("APP_URL");
		Constants.BROWSER = properties.getProperty("BROWSER");
		Constants.USERNAME= properties.getProperty("USERNAME");
		Constants.PASSWORD = properties.getProperty("PASSWORD");
		
	}
	
	//All the page class has to be initialized in this method
		public void initWebElements()
		{
			PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());
		}

}
