package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage {

	WebDriver driver;
	
	public CheckoutInformationPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id= "first-name")
	private WebElement firstNameField;
	
	@FindBy(id="last-name")
	private WebElement lastNameField;
	
	@FindBy(id="postal-code")
	private WebElement postalCodeField;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(id="finish")
	private WebElement finishButton;
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	private WebElement checkoutComplete;
	
	
	public WebElement firstNameField() {
		
		return firstNameField;
		
	}

	public WebElement lastNameField() {
		
		return lastNameField;
		
	}
	
	public WebElement postalCodeField() {
		
		return postalCodeField;
		
	}
	
	public WebElement continueButton() {
		
		return continueButton;
		
	}
	
	public WebElement finishButton() {
		
		return finishButton;
		
	}
	
	public WebElement checkoutComplete() {
		
		return checkoutComplete;
		
	}
	
	
}
