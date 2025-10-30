package Browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class SeleniumMultiBrowsers {
	
	
	@Test
	public void openChrome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.javatpoint.com/c-sharp-tutorial");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title,"Learn C# Tutorial - javatpoint");
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}
	
	@Test
	public void openEdge() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.javatpoint.com/c-sharp-tutorial");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title,"Learn C# Tutorial - javatpoint");
		
		Thread.sleep(3000);
		
		//close closes the current window but quit closes the web driver session
		driver.quit();
		
	}
}
