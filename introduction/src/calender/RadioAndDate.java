package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioAndDate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println( driver.findElement(By.id("Div1")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		//driver.findElement(By.id("Div1")).isEnabled();
//		System.out.println( driver.findElement(By.id("Div1")).isEnabled());
		
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			System.out.println("Return Date is Enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		System.out.println("Successful Test");
		driver.quit();

	}

}
