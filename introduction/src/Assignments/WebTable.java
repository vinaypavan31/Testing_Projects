package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println( driver.findElements(By.xpath("//table[@name='courses']//tr")).size());
		
		System.out.println( driver.findElements(By.xpath("//table[@name='courses']//th")).size());
		
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@name='courses']//tr[3]/td"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}

	}

}
