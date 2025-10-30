package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.partialLinkText("Ques/ResumeAssistance/Material")).click();
		
		Set<String> windows=driver.getWindowHandles(); //[parentId, childId]
		Iterator<String> it=windows.iterator();
		//System.out.println(windows);
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		//driver.navigate().to("https://rahulshettyacademy.com/documents-request");
		
		String email=driver.findElement(By.partialLinkText("mentor@rahulshettyacademy")).getText();
		System.out.println(email);
//		driver.navigate().back();
//		
//		driver.findElement(By.id("username")).sendKeys(email);
		
		System.out.println("Test successful");
		

	}

}
