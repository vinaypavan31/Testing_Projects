package SSL;



import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
//if we want to block the popups while opening web site then chrome options code is available in capabilities documentation
		
//		//options.addExtensions(null);
//		Proxy proxy=new Proxy();
//		proxy.setHttpProxy("ipaddress:4444");
//		options.setCapability("proxy", proxy);
//		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://self-signed.badssl.com/");

		// driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

	}

}
