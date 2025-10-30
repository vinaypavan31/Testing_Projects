package XpathandCss;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestXpath {
	
	@Test
	public void testX() throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver","C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.scientecheasy.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@role='menubar']/li/a[text()='Java']//self::a[@href='https://www.scientecheasy.com/2018/07/core-java-tutorial.html/']")).click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Core Java Tutorial for Beginners Step by Step - Scientech Easy");
		driver.quit();
	}

}
