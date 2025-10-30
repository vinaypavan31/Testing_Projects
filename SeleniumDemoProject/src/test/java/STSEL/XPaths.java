package STSEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPaths {
	
	@Test
	public void XpathEles() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		driver.get("https://www.scientecheasy.com/");
		
		driver.findElement(By.xpath("//a[@title='Java']")).click();
		
		String titleOfThePage = driver.getTitle();	
		
		System.out.println(titleOfThePage);
		
		driver.quit();
		System.out.println("test is successfully executed");
	}

}
