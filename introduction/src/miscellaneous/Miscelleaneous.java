package miscellaneous;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Miscelleaneous {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//session 
		
		//click on any link 
		//redirected to login page 
		//for above scenario  we use deletecookieNamed()

		driver.get("https://google.com");
		
		//screen shot
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\arpavan\\ScreenSots\\screenshot1.png"));
	}

}
