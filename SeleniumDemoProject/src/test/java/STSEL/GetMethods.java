package STSEL;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class GetMethods {
	
	@Test
	public void TestGetMethods() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpavan\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	//used to navigate to browser and returns void
	driver.get("https://www.scientecheasy.com/");
	//driver.navigate().to("https://www.scientecheasy.com/");
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a[@title='Python']")).click();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	driver.navigate().refresh();
	System.out.println("refresed the page sucessfully");
	//used to get url where driver in controlling
	String curl = driver.getCurrentUrl();
	System.out.println(curl);
	//used to get the title of the web page
	driver.getTitle();
	//used to get the page source of the page
	//String ps =driver.getPageSource();
	//driver.navigate().
	 //String text = driver.getText();
	//driver.getTagName();
	//driver.getCssValue()
	//driver.getAttribute(string name); returns string
	//Dimension element=driver.getSize();
	//System.out.println(ps);
	driver.close();
}
}