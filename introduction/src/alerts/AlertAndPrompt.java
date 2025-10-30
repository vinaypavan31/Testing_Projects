package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPrompt {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String name = "Areti R S Adi Venkata Vinay Pavan";

		driver.findElement(By.id("name")).sendKeys(name);

		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

	}

}
