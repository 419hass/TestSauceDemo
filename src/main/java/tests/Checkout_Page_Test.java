package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import library.Browsers;
import library.Checkout_Page;
import library.Constants;
import library.Login_Page;

public class Checkout_Page_Test {

	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
	}
	
	@AfterClass
	public void afterClass() {
	}
	
	@Parameters("Browser")
	@BeforeMethod
	public void setup(String Browser) {
		driver = library.Browsers.launchBrowser(Browser);
		
	/*	if(Browser.equalsIgnoreCase("Chrome")) {
			driver = library.Browsers.launchBrowser("chrome");
		} else if(Browser.equalsIgnoreCase("Firefox")) {
			driver = library.Browsers.launchBrowser("firefox"); 
		} else if(Browser.equalsIgnoreCase("Edge")) {
			driver = library.Browsers.launchBrowser("edge"); 
		}
		
		*/
		driver.get(library.Constants.URL);
		
		Login_Page loginPage = new Login_Page(driver);
		loginPage.enterUsername(Constants.STANDARD_USER);
		loginPage.enterPassword(Constants.PASSWORD);
		loginPage.clickLoginButton();
		
	}
	
	@AfterMethod
	public void after() {
	//	driver.quit;
	}
	
	@Test
	public void requireInput() {
		Checkout_Page checkoutPage = new Checkout_Page(driver);
		checkoutPage.clickCartButton();
		checkoutPage.clickCheckoutButton();
		checkoutPage.inputFirst(Constants.STANDARD_USER);
		checkoutPage.inputLast(Constants.PASSWORD);
		checkoutPage.inputZip("00000");
		checkoutPage.clickContinueButton();
		checkoutPage.clickFinishButton();
	}
	
	@Test
	public void missingInput() {
		Checkout_Page checkoutPage = new Checkout_Page(driver);
		checkoutPage.clickCartButton();
		checkoutPage.clickCheckoutButton();
		checkoutPage.clickContinueButton();
	}
}
