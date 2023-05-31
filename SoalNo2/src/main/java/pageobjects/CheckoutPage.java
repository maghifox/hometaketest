package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css= ".inventory_item_price")
	private WebElement productPrice;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	public WebElement productPrice() {
		
		return productPrice;
		
	}

	public WebElement checkoutButton() {
		
		return checkoutButton;
		
	}
	
	
}
