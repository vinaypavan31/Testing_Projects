package vinay.tests;
//import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import vinay.TestComponents.Basetest;
import vinay.pageobjects.CartPage;
import vinay.pageobjects.ProductCatalouge;

public class ErrorValidationTest extends Basetest {
	@Test(groups= {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException {
		String productName = "ZARA COAT 3";
		ProductCatalouge productCatalouge = landingPage.loginApplication("reliablereads088@gmail.com", "Raul@sel9");
		Assert.assertEquals(landingPage.getErrorMessage(),"Incorrect email or password.");
	}

	@Test
	public void AProductErrorValidation() throws IOException, InterruptedException {

		String productName="ZARA COAT 3";
		ProductCatalouge productCatalouge = landingPage.loginApplication("ramsai14264@gmail.com","Rahul@sel9");
		List<WebElement> products=productCatalouge.getProductList();
		productCatalouge.addProductToCart(productName);
		CartPage cartPage =productCatalouge.goToCartPage();
		Boolean match=cartPage.VerifyProductDisplay("Azure");
		Assert.assertFalse(match);

	}
}