package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeDynamicBrowserTest {

	public WebDriver driver = null;

	@AfterMethod
	public void closeBrowserTest() {
		driver.quit();
	}

	@Parameters("browser")
	@BeforeMethod
	public void openBrowserTest(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("this is invalid browser");
		}

		driver.manage().window().maximize();
	}

	@Test
	public void verifyScienceTechTest() throws InterruptedException {

		driver.get("https://www.selenium.dev/");

		String title = driver.getTitle();

		Assert.assertEquals(title, "Selenium");

		Thread.sleep(2000);

	}

	@Test
	public void verifySeleniumTest() throws InterruptedException {

		driver.get("https://www.scientecheasy.com/");

		String title = driver.getTitle();

		Assert.assertEquals(title, "Scientech Easy - Tutorials for Beginners");
		Thread.sleep(2000);
	}
}
