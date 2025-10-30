package Webelements;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass {
	
	@Test
	public void findElementTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.com/");
		
		driver.findElement(By.className("")).click();
		
		driver.findElement(By.name("email")).sendKeys("ramsai14264@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}
}
