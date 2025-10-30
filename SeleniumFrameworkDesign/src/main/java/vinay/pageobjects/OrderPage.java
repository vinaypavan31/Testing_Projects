package vinay.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vinay.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent {
	WebDriver driver;
	@FindBy(xpath="//tr/td[2]")
	List<WebElement> productNames;

	public OrderPage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public Boolean VerifyOrderDisplay(String productName) {
		Boolean match=productNames.stream().anyMatch(name->name.getText().equalsIgnoreCase("ZARA COAT 3"));
		return match;
	}

}
