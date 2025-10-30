package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all the web elements into list
		
		List<WebElement> productsList=driver.findElements(By.xpath("//tr/td[1]"));
	
		//capture text of all web elements into new(original) list
		List<String> originalList=productsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
	
		//sort in the list of step 3 ->sorted list
		
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		//scan the name column with getText ->beans->print the price of the rice
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		price=rows.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		if(price.size()<1) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}}
		while(price.size()<1);
		
		
		
		System.out.println("successful");
	}

	private static String getPriceVeggie(WebElement s) {
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
			
				return priceValue;
			}

}
