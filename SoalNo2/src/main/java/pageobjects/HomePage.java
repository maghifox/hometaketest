package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//div[normalize-space()='Sauce Labs Backpack']")
	private WebElement product;
	
	@FindBy(xpath= "//div[@class='inventory_item_price']")
	private WebElement productprice;
		
	public WebElement product() {
		
		return product;
		
	}
	
	public WebElement productprice() {
		
		return productprice;
		
	}

}
