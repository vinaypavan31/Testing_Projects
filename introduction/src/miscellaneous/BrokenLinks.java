package miscellaneous;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		//broken URL
		
		//step 1 -is to get all urls tied up to the links using selenium
		
		// java methods will call the URL's and gets you the status code
		
		//if status code is greater than 400 url is not working 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link:links) {
			
			
			String url=link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode=conn.getResponseCode();
			System.out.println(resCode);
			
		}
		
		
		
		
		
		

	}

}
