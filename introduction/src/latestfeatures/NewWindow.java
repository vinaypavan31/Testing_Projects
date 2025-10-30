package latestfeatures;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);

		driver.get("https://rahulshettyacademy.com/");

		String text = driver.findElement(By.xpath("//div/h2/a[contains(text(),'25+ Courses')]")).getText();
		driver.switchTo().window(parentId);
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(text);
		// screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\arpavan\\ScreenSots\\logo.png"));

		// get height and width

		int height = name.getRect().getDimension().getHeight();
		int width = name.getRect().getDimension().getWidth();

		System.out.println("HEIGHT : " + height + "   WIDTH : " + width);
		System.out.println("Successful!!!");

	}

}
