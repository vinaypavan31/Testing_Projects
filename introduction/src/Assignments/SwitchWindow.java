package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		String mess2=driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(mess2);
		
		driver.switchTo().window(parentId);
		
		String mess1 =driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(mess1);
		
		
		
		

	}

}
