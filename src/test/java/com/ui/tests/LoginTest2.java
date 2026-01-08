package com.ui.tests;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
//import com.utility.BrowserUtility;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest2 {
	

	@Test(description = "Verifies with the valid user is able to login into the application", groups = { "e2e", "sanity" })
	public void loginTest() {
		
		HomePage homepage = new HomePage(CHROME, true);
		String userName = homepage.goToLoginPage().doLoginWith("pasole9430@hudisk.com", "Password@1234").getUserName();
		System.out.println(userName);
	}
	
	

}
