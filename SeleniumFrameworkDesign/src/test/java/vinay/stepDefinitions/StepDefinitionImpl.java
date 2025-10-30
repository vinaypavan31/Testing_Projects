package vinay.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import vinay.TestComponents.Basetest;
import vinay.pageobjects.CartPage;
import vinay.pageobjects.CheckoutPage;
import vinay.pageobjects.LandingPage;
import vinay.pageobjects.LastPage;
import vinay.pageobjects.ProductCatalouge;

public class StepDefinitionImpl extends Basetest{
	public LandingPage landingPage;
	public ProductCatalouge productCatalouge;
	//public CartPage cartPage;
	public LastPage lastPage;
	@Given("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page() throws IOException {
		landingPage=launchApplication();
	}
	
	@Given( "^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username,String password) {
		productCatalouge = landingPage.loginApplication(username,password);
	}
	@When ("^I add the product (.+) to cart$")
	public void i_add_product_to_cart(String productName) throws InterruptedException {
		List<WebElement> products=productCatalouge.getProductList();
		productCatalouge.addProductToCart(productName);
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void checkout_and_submit_order(String productName) {
		CartPage cartPage =productCatalouge.goToCartPage();
		Boolean match=cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage=cartPage.goToCheckOut();
		checkoutPage.selectCountry("india");
		lastPage=checkoutPage.submitOrder();
	}
	
	@Then("{string} message is displayed on confirmation page")
	public void message_displayed_confirmationPage(String string) {
		String thanksMessage=lastPage.getThanksMessage();
		Assert.assertTrue(thanksMessage.equalsIgnoreCase(string));
		driver.close();
	}
	
	@Then("{string} message is displayed")
	public void something_message_displayed(String strArg1) {
		Assert.assertEquals(landingPage.getErrorMessage(),strArg1);
		driver.close();
	}
	
}
