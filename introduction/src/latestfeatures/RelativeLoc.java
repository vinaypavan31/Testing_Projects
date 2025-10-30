package latestfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class RelativeLoc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox=driver.findElement(By.cssSelector("input[name='name']"));
		
		System.out.println( driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateofBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//it will not identify the flex elements input box
		 driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		 
		WebElement icecream= driver.findElement(By.xpath("//label[contains(text(),'IceCreams!')]"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
		//same for toRightOf
	}

}
