package Assignments;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormAssignmentAngular {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//form/div/input[@name='name']")).sendKeys("Vinay Pavan");
		
		
		driver.findElement(By.xpath("//form/div/input[@name='email']")).sendKeys("ramsai@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Passcode123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select options=new Select(dropdown);
		options.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.xpath("//form/div/input[@name='bday']")).sendKeys("31-12-1999");
		
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		String message= driver.findElement(By.xpath("//div[contains(@class, 'alert-success') and contains(., 'Success! The Form has been submitted successfully')]")).getText();
		
		System.out.println(message);
		
		//Assert.assertEquals(message,"Success! The Form has been submitted successfully!.");
		
		String[] reqmes=message.split(" ");
		//reqmes[0]=" ";
		
		String[] sepres=reqmes[0].split(" ");
		System.out.println(sepres[0]);
//		System.out.println(reqmes[0]);
//		for(String x:reqmes) {
//		System.out.println(x);}
//		String actual="";
//		for(String x:reqmes) {
//			actual=actual+x+" ";
//		}
//	
//		String required="Success! The Form has been submitted successfully!.";
//		System.out.println(actual);
		//Assert.assertEquals(actual, required);
		
		driver.quit();
		System.out.println("Test is successful");
		
		
	}
	
	

}
