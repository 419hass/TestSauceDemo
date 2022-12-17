package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	By loginButton = By.xpath("//input[@id='login-button']");
	
	public void enterUsername (String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword (String pword) {
		password.sendKeys(pword);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	
	
}
