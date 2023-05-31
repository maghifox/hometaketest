package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css= "#login_credentials")
	private WebElement username;
	
	@FindBy(css= ".login_password")
	private WebElement password;
	
	@FindBy(id="user-name")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public WebElement username() {
		
		return username;
		
	}
	
	public WebElement password() {
		
		return password;
		
	}
	
	public WebElement usernameField() {
		
		return usernameField;
		
	}
	
	public WebElement passwordField() {
		
		return passwordField;
		
	}
	
	public WebElement loginButton() {
		
		return loginButton;
		
	}
	
	
}
