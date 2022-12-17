package library;

import java.util.List;

import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inventory_Page {

	WebDriver driver;
	
	//WebDriverWait wait = new WebDriverWait(driver, 20);
	
	
	
	public Inventory_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By addCart = By.xpath("//button[contains(@id,'add-to-cart')]");
	//int count = driver.findElements(addCart).size();
	
	/*I tried many different ways of clicking all buttons without hard-coding each x-path. 
	I learnt how to use the contain handle. In the end, the code was simple. 
	I can still make it easier to read
	*/
	public void clickAddCart() {
		for (int i = 0; i < driver.findElements(addCart).size(); i++) {
			driver.findElement(addCart).click();
		}
			
	}

	
	//List<WebElement> allButtons = driver.findElements(By.xpath("//button[contains(@id,'add-to-cart')]"));
	

	//By addCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	
	
	//for (int i = 0; i < count; i++) {
	//	System.out.println(allButtons);
	//}	
	
	//int count = allButtons.size();
	
	/*public void clickAddCart() {
		for (int i = 0; i < count; i++) {
			driver.findElements((By) allButtons);
			((WebElement) allButtons).click();
		}
	*/
	
	/*public void clickAddCart() {
		WebElement b;
		for (int i = 0; i < allButtons.size(); i++) {
			wait.until(ExpectedConditions.visibilityOfElementLocated
					(By.xpath("//button[contains(@id,'add-to-cart')]")));
			
			
			System.out.println(allButtons);
			//b.click();
	
			}
		
		}*/
	
	
}


