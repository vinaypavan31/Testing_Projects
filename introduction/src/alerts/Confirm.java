package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String name = "Areti R S Adi Venkata Vinay Pavan";

		driver.findElement(By.id("name")).sendKeys(name);

		driver.findElement(By.id("confirmbtn")).click();

		// Thread.sleep(4000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		driver.quit();

	}

}
