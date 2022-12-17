package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {

	WebDriver driver;
	
	public Checkout_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By cartButton = By.xpath("//div[@id='shopping_cart_container']");
	
	By checkoutButton = By.xpath("//button[@id='checkout']");
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement postalcode;
	
	By continueButton = By.xpath("//input[@id='continue']");
	
	By finishButton = By.xpath("//button[@id='finish']");
	
	public void clickCartButton() {
		driver.findElement(cartButton).click();
	}
	
	public void clickCheckoutButton() {
		driver.findElement(checkoutButton).click();
	}
	
	public void clickContinueButton() {
		driver.findElement(continueButton).click();
	}
	
	public void clickFinishButton() {
		driver.findElement(finishButton).click();
	}
	
	public void inputFirst(String fName) {
		firstname.sendKeys(fName);
	}
	public void inputLast(String lName) {
		lastname.sendKeys(lName);
	}
	public void inputZip(String zip) {
		postalcode.sendKeys(zip);
	}
}


