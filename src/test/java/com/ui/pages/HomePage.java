package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.QA;
import com.utility.BrowserUtility;
//import com.utility.CSVReaderUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;

//import static com.utility.PropertiesUtil.*;

public class HomePage extends BrowserUtility {
	Logger logger = LoggerUtility.getLogger(this.getClass());
	
	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign')]");
	
	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless); //To call the parent class constructor from the child constructor
		//goToWebsite(readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJSON(QA));
		
	}
	
	public HomePage(WebDriver driver) {
		super(driver); //to call the parent class constructor
		goToWebsite(JSONUtility.readJSON(QA));
	}

	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

	public void quit() {
		getDriver().quit();
		
	}


}
