package Browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserOptions {
	
	@Test
	public void chromeProfiling() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();

		// set binary -- setting chrome browser binary path
		// options.setBinary("path to chrome binary");

		// start chrome maximized

		options.addArguments("--start-maximized");
		
		//specifi profile
		options.addArguments("--user-data-dir=C:\\Users\\arpavan\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		Thread.sleep(3000);
		//driver.manage().window().maximize();

		driver.get("https://www.javatpoint.com/c-sharp-tutorial");

		String title = driver.getTitle();

		Assert.assertEquals(title, "Learn C# Tutorial - javatpoint");

		

		driver.quit();
	}

	public void edgeProfiling() {

	}
}
