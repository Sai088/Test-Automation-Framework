package com.ui.tests;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
//import com.utility.BrowserUtility;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	

	public static void main(String[] args) {
		
		HomePage homepage = new HomePage(CHROME, true);
		LoginPage loginPage =homepage.goToLoginPage();
		loginPage.doLoginWith("pasole9430@hudisk.com", "Password@1234");

	}
	
	

}
