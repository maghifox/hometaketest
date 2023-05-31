package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.ProductPage;
import pageobjects.HomePage;
import pageobjects.CheckoutPage;
import pageobjects.CheckoutInformationPage;

import resources.Base;

public class MainFlow extends Base {
	
	WebDriver driver;
	
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	CheckoutPage checkoutPage;
	CheckoutInformationPage checkoutInformationPage;
	String productPrices;
	
	@Given("^I Open Chrome Browser and navigate to the url$")
    public void i_open_chrome_browser_and_navigate_to_the_url() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
    }

    @When("^I put the provided credentials as a standard user into the fields$")
    public void i_enter_the_credentials_as_a_standar_user_into_the_fields() {
    	loginPage = new LoginPage(driver);
    	String[] usernamesArray = loginPage.username().getText().split("\\n");
    	String[] passwordArray = loginPage.password().getText().split("\\n");
    	
    	loginPage.usernameField().sendKeys(usernamesArray[1]);
		loginPage.passwordField().sendKeys(passwordArray[1]);
    }

    @And("^I click the Login button$")
    public void i_click_the_login_button() {
    	loginPage.loginButton().click();
    }

    @And("^I click one of the products$")
    public void i_click_one_of_the_products() throws InterruptedException {
    	homePage = new HomePage(driver);
    	productPrices = homePage.productprice().getText();
    	homePage.product().click();
 
    }

    @And("^I add the product to the cart$")
    public void i_add_the_product_to_the_cart() {
    	productPage = new ProductPage(driver);
    	productPage.addToCartButton().click();
    }

    @And("^I go to the cart page$")
    public void i_go_to_the_cart_page() {
    	productPage.cartIcon().click();
    }

    @And("^I verify the product price and click the checkout button$")
    public void i_click_the_checkout_button() {
    	checkoutPage = new CheckoutPage(driver);
    	Assert.assertEquals(checkoutPage.productPrice().getText(), productPrices);
     	checkoutPage.checkoutButton().click();
     	
    }

    @And("^I fill the information needed$")
    public void i_fill_the_information_needed() {
    	checkoutInformationPage = new CheckoutInformationPage(driver);
    	checkoutInformationPage.firstNameField().sendKeys("test");
    	checkoutInformationPage.lastNameField().sendKeys("test1");
    	checkoutInformationPage.postalCodeField().sendKeys("12324");
    }

    @And("^I click the continue button$")
    public void i_click_the_continue_button() {
    	checkoutInformationPage.continueButton().click();
    }

    @And("^I click the finish button$")
    public void i_click_the_finish_button() {
    	checkoutInformationPage.finishButton().click();
    }
    
    @Then("^I can see the checkout is completed$")
    public void i_can_see_the_checkout_is_completed() {
    	Assert.assertTrue(checkoutInformationPage.checkoutComplete().isDisplayed());
    }
    
    @After
    public void closeBrowser() {
    	driver.close();
    }
   
}
