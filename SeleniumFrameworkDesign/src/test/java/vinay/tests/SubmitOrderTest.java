package vinay.tests;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import vinay.TestComponents.Basetest;
import vinay.TestComponents.Retry;
import vinay.pageobjects.CartPage;
import vinay.pageobjects.CheckoutPage;
import vinay.pageobjects.LastPage;
import vinay.pageobjects.OrderPage;
import vinay.pageobjects.ProductCatalouge;

public class SubmitOrderTest extends Basetest {
	String productName="ZARA COAT 3";
	@Test(dataProvider="getData",groups= {"Purchase"},retryAnalyzer=Retry.class)
	public void submitOrder(HashMap<String,String> input) throws IOException, InterruptedException {


		ProductCatalouge productCatalouge = landingPage.loginApplication(input.get("email"),input.get("password"));
		List<WebElement> products=productCatalouge.getProductList();
		productCatalouge.addProductToCart(input.get("product"));
		CartPage cartPage =productCatalouge.goToCartPage();
		Boolean match=cartPage.VerifyProductDisplay(input.get("product"));
//		System.out.println(match);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage=cartPage.goToCheckOut();
		checkoutPage.selectCountry("india");
		LastPage lastPage=checkoutPage.submitOrder();
		String thanksMessage=lastPage.getThanksMessage();
		Assert.assertTrue(thanksMessage.equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Successful");

	}
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest() {
		ProductCatalouge productCatalouge = landingPage.loginApplication("ramsai14264@gmail.com","Rahul@sel9");
		OrderPage orderPage=productCatalouge.goToOrdersPage();
		Assert.assertTrue(orderPage.VerifyOrderDisplay(productName));
	}

	
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String,String>> data=getJSONDataToMap(System.getProperty("user.dir") + "\\src\\test\\java\\vinay\\data\\PurchaseOrder.json");
		return new Object[][]{{data.get(0)},{data.get(1)}};
	}



//	@DataProvider
//	public Object[][] getData()  {
//
////		HashMap<String,String> map=new HashMap<String,String>();
////		map.put("email","ramsai14264@gmail.com");
////		map.put("password", "Rahul@sel9");
////		map.put("product", "ZARA COAT 3");
////		HashMap<String,String> map1=new HashMap<String,String>();
////		map.put("email","vinaypavan14264@gmail.com");
////		map.put("password", "Rahul@rest9");
////		map.put("product", "ADIDAS ORIGINAL");
//
//		return new Object[][] {{map},{map1}};
//
//	}

}

