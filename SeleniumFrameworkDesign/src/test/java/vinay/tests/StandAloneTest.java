package vinay.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StandAloneTest {
	@Test(groups= {"stand"},dataProvider= "getData")

	public  void standAloneTest(String email,String password,String product ) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client/");
		//LandingPage landingPage=new LandingPage(driver);

		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userPassword")).sendKeys(password);
		driver.findElement(By.id("login")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));

		WebElement prod= products.stream()
	    .filter(p ->
	        p.findElement(By.cssSelector("b")).getText().equals(product))
	    .findFirst().orElse(null);

		prod.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		//toast-container


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

		//class=ng-animating for loading

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[routerLink*='/dashboard/cart']")));
		driver.findElement(By.cssSelector("button[routerLink*='/dashboard/cart']")).click();

		List<WebElement> cartProducts= driver.findElements(By.cssSelector("div[class='infoWrap'] h3"));

		Boolean match=cartProducts.stream().anyMatch(cartProduct ->cartProduct.getText().equalsIgnoreCase(product));
		Assert.assertTrue(match);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build().perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();

		driver.findElement(By.cssSelector(".action__submit")).click();

		String thanksMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();

		Assert.assertTrue(thanksMessage.equalsIgnoreCase("Thankyou for the order."));
		driver.quit();
		System.out.println("Successful");

	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=
				new Object[][] {
	        { "ramsai14264@gmail.com", "Rahul@sel9", "ZARA COAT 3" },
	        { "vinaypavan14264@gmail.com", "Rahul@rest9", "ADIDAS ORIGINAL" }
	    };


		return data;
	}


}





