package realtime;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		// give me the count of links on the page

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		// count of footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting web driver scope
		int footerLinks = footerdriver.findElements(By.tagName("a")).size();
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> clLinksList = columndriver.findElements(By.tagName("a"));

		int clLinks = columndriver.findElements(By.tagName("a")).size();
		// click on each link in the coloumn and check if the page is opening and get
		// title of every tab
		for (int i = 1; i < clLinks; i++) {

			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		System.out.println(links.size());
		System.out.println(footerLinks + " links in footer");
		;

		System.out.println("columns links are " + clLinks);

	}

}
