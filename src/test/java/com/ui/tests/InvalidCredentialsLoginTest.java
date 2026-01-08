package com.ui.tests;

//import static com.constants.Browser.*;

//import com.dataproviders.LoginDataProvider;
import com.ui.pages.HomePage;
//import com.ui.pages.LoginPage;
//import com.utility.BrowserUtility;
import com.ui.pojo.User;
import com.utility.LoggerUtility;

import static org.testng.Assert.*;

import org.apache.logging.log4j.Logger;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Listeners(com.ui.listeners.TestListener.class)
public class InvalidCredentialsLoginTest extends TestBase{
	
	/*
	 * Test Method
	 * 1.Test Script small
	 * 2. You cannot have conditional statements, loops, try-catch in your test method(Test Scripts --> Test Steps)
	 * 3. Reduce the use of Local Variables
	 * 4. Atleast one assertion should be there in the test method
	 * */
	
	Logger logger = LoggerUtility.getLogger(this.getClass());
	private static final String INVALID_EMAIL_ADDRESS = "saitej12@gmail.com";
	private static final String INVALID_PASSWORD = "Tester@1234";

	@Test(description = "Verify if the proper error message is shown for the user when they enter invalid credentials", groups = { "e2e", "sanity" })
	public void loginTest() {
		
		assertEquals(homepage.goToLoginPage().doLoginWithInvalidCredentials(INVALID_EMAIL_ADDRESS, INVALID_PASSWORD).getErrorMessage(), "Authentication failed.");
	}
	
}
