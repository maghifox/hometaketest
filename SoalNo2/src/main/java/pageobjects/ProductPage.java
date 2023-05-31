package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id= "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartButton;
	
	@FindBy(css= ".shopping_cart_link")
	private WebElement cartIcon;
	
	
	public WebElement addToCartButton() {
		
		return addToCartButton;
		
	}
	
	public WebElement cartIcon() {
		
		return cartIcon;
		
	}

}
