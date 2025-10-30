package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

//		int num = 0;
//		while (num < 4) {
//			driver.findElement(By.id("hrefIncAdt")).click();// 5 Adult
//			num++;
//
//		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=0;i<4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();// 5 Adult
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
