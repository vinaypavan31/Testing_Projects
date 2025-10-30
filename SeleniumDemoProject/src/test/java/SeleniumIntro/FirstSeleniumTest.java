package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	@Test
	public void OpenSiteInChrome() {
		
		//set the path to Chromedriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		
		// create a new instance of the Chromedriver
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.scientecheasy.com/");
	}
	
	@Test
	public void OpenSiteInFirefox() {
		
		//set the path to Chromedriver executable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\geckodriver.exe");
		
		// create a new instance of the Chromedriver
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.scientecheasy.com/");
		driver.quit();
	}

}
