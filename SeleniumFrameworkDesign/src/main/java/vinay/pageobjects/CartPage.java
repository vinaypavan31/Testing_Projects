package vinay.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vinay.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {

	WebDriver driver;
	@FindBy(css="div[class='infoWrap'] h3")
	List<WebElement> cartProducts;

	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;

	public CartPage(WebDriver driver) {
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public Boolean VerifyProductDisplay(String productName) {
		Boolean match=cartProducts.stream().anyMatch(cartProduct ->cartProduct.getText().equalsIgnoreCase(productName));
		return match;

	}

	public CheckoutPage goToCheckOut() {
		checkout.click();
		CheckoutPage checkoutPage=new CheckoutPage(driver);
		return checkoutPage;
	}

}
