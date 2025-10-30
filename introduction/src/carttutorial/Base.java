package carttutorial;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));

		// expected array
		String[] itemsNeeded = { "Cucumber", "Brocolli",  "Pumpkin","Beetroot" };
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		System.out.println("Successful");

	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String foramattedName = name[0].trim();
			// name[0]-"brocolli",name[1]=1 kg
			// from above we get "- 1 kg " as extra which we didn't pass in array
			// Brocolli - 1 Kg
			// Brocolli, 1 Kg

			// format it to get actual vegetable name

			// check whether name you extracted is present in array or not

			// convert array into arraylist for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			int j = 0;

			if (itemsNeededList.contains(foramattedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break;

				if (j == itemsNeeded.length) {
					break;
				}

			}
		}

		
	}

}
