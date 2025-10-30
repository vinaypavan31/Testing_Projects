package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelection {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		// .  is used for css seletors when there is a space between classes
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		System.out.println("successful test");
	}

}