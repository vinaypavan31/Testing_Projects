package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MoblieApp {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-infobars"); // Optional: disables other infobars
	    options.setExperimentalOption("prefs", java.util.Collections.singletonMap("profile.password_manager_leak_detection", false));
	    WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");

		driver.findElement(By.cssSelector("input[value='user']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal']")));

		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		WebElement address = driver.findElement(By.xpath("//select"));

		Select option = new Select(address);
		option.selectByContainsVisibleText("Consultant");

		driver.findElement(By.xpath("//input[@id='terms']")).click();

		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));

		Assert.assertEquals(driver.getTitle(), "ProtoCommerce");
		
		List<WebElement> items=driver.findElements(By.xpath("//app-card-list/app-card/div/div[@class='card-footer']/button"));
		
//		for(int i=0;i<items.size();i++) {
//			items.get(i).click();
//		}
		for(WebElement item:items) {
			item.click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		System.out.println("Test is successful");

		//driver.close();
	}

}
