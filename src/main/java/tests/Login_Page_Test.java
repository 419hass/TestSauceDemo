package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.Constants;
import library.Login_Page;

public class Login_Page_Test {

	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("");
	}
	
	@Parameters("Browser")
	@BeforeMethod
	public void setup(String Browser) {
		System.out.println("");
		//driver = library.Browsers.launchBrowser("Chrome");
		
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = library.Browsers.launchBrowser("chrome");
		} else if(Browser.equalsIgnoreCase("Firefox")) {
			driver = library.Browsers.launchBrowser("firefox"); 
		} else if(Browser.equalsIgnoreCase("Edge")) {
			driver = library.Browsers.launchBrowser("edge"); 
		}
		
		driver.get(library.Constants.URL);
		
	}
	
	@AfterMethod
	public void after() {
		driver.quit();
	}
	
	@Test
	public void standardUserLogin() {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.enterUsername(Constants.STANDARD_USER);
		loginPage.enterPassword(Constants.PASSWORD);
		loginPage.clickLoginButton();
	}
	
	@Test
	public void lockedUserLogin() {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.enterUsername(Constants.LOCKED_USER);
		loginPage.enterPassword(Constants.PASSWORD);
		loginPage.clickLoginButton();
	}
	
	
}
