package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		//invoking the browser
		//chrome- browser -ChromeDriver-> Methods
		//firefox driver also there ->methods 
		//all the method names and functionalities are same for all browsers
		//create object of the class
		
		//ChromeDriver driver=new ChromeDriver();
		
		//setp to invoke the chrome driver
		
		//Selenium Manager
		System.setProperty("webdriver.chrome.driver", "C:/Users/arpavan/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/Users/arpavan/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:/Users/arpavan/Downloads/edgedriver_win64/msedgedriver.exe");
		//WebDriver  driver = new EdgeDriver();
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println("executed");
		
		
		
		driver.quit();

	}

}
