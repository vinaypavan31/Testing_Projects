package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("rr");
		List<WebElement>prods=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> resultedList=prods.stream().filter(s->s.getText().contains("rr"))
		.collect(Collectors.toList());
		
		//3 result
		
		Assert.assertEquals(prods.size(), resultedList.size());
		
		System.out.println("successful");
		
		
		
		
		
	}

}
