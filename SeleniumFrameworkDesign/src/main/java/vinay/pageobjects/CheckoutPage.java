package vinay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vinay.AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent {

	WebDriver driver;

	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement country;

	@FindBy(css=".ta-item:nth-of-type(2)")
	WebElement selectCountry;

	@FindBy(css=".action__submit")
	WebElement placeOrder;

	By dropdown=By.cssSelector(".ta-results");
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectCountry(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(country, countryName).build().perform();
		waitForElementToAppear(dropdown);
		selectCountry.click();


	}
	public LastPage submitOrder() {
		placeOrder.click();
		LastPage lastPage=new LastPage(driver);
		return lastPage;
	}


}
