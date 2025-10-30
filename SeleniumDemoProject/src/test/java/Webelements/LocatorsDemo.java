package Webelements;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	//test case -- verify saucedemo signing functionality
	/*1.open saucedemo
	 * 2.verify saucedemo page title
	 * 3.enter user name , password
	 * 4.click on login in button
	 * 6.verify page title again
	 */
	@Test
	public void verifySauceDemoLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//1.open saucedemo
		driver.get("https://www.saucedemo.com/");
		
		 //* 2.verify saucedemo page title
		String expectedTitle ="Swag Labs";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		 
		
		 //* 3.enter user name , password
		WebElement usernameAdd=driver.findElement(By.id("user-name"));
		usernameAdd.sendKeys("standard_user");
		WebElement passwordAdd = driver.findElement(By.id("password"));
		passwordAdd.sendKeys("secret_sauce");
		// * 4.click on login button
		WebElement loginAdd=driver.findElement(By.id("login-button"));
		loginAdd.click();
		 //* 5.verify page title again
		String expectedloginTitle="Swag Labs";
		String actualloginTitle=driver.getTitle();
		Assert.assertEquals(expectedloginTitle,actualloginTitle);
		
		//quit window
		driver.quit();
		
	}
	 

}
