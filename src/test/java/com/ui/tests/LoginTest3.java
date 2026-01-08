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


@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest3 extends TestBase{
	
	/*
	 * Test Method
	 * 1.Test Script small
	 * 2. You cannot have conditional statements, loops, try-catch in your test method(Test Scripts --> Test Steps)
	 * 3. Reduce the use of Local Variables
	 * 4. Atleast one assertion should be there in the test method
	 * */
	

	@Test(priority=1, description = "Verifies with the valid user is able to login into the application", groups = { "e2e", "sanity" }, dataProviderClass = com.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
		
		assertEquals(homepage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test Tester");
	}
	
	@Test(priority=2, description = "Verifies with the valid user is able to login into the application", groups = { "e2e", "sanity" }, dataProviderClass = com.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestCSVDataProvider")
	public void loginCSVTest(User user) {
		
		assertEquals(homepage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test Tester");
	}
	
	@Test(priority=3, description = "Verifies with the valid user is able to login into the application", groups = { "e2e", "sanity" }, dataProviderClass = com.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider")
	public void loginExcelTest(User user) {
		
		assertEquals(homepage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test Tester");
	}
	
	@Test(priority=4, description = "Verify with the valid user is able to login into the application", groups = { "e2e", "sanity" }, dataProviderClass = com.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider",
			retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginRetryTest(User user) {
		
		//logger.info("Started executing loginRetryTest method");
		assertEquals(homepage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test Tester");
		//logger.info("loginRetryTest method execution is completed");
	}

}
