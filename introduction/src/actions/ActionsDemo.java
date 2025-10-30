package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://aws.amazon.com/");
		
		Actions a=new Actions(driver);
		
		WebElement move=driver.findElement(By.cssSelector("div[class*='awsm-ik-navatar']"));
		
		driver.findElement(By.cssSelector("button[id='search-toggle']")).click();
		
//		a.moveToElement(driver.findElement(By.cssSelector("input[placeholder='I’m looking for...']")))
//		.click().keyDown(Keys.SHIFT)
//		.sendKeys("ec").keyUp(Keys.SHIFT).sendKeys("2")
//		.build()
//		.perform();
		
		a.click(driver.findElement(By.cssSelector("input[placeholder='I’m looking for...']")))
		.keyDown(Keys.SHIFT)
		.sendKeys("ec").keyUp(Keys.SHIFT).sendKeys("2")
		.doubleClick()
		.build()
		.perform();
		
		
		
		//dont miss to add build and perform , perform is for executing the builded thing
		
		//moves to specific element
		a.moveToElement(move).contextClick().build().perform();
		
		System.out.println("Test is successful");
		

	}

}
