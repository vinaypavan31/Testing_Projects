package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		
		//driver.findElement(By.id("draggable")).click();
		
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		
		System.out.println(text);
		System.out.println("Test Success");

	}

}
