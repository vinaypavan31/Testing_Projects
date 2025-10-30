package vinay.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vinay.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//WebElement userEmail=driver.findElement(By.id("userEmail"));

	//PageFactory

	@FindBy(id="userEmail")
	WebElement userEmail;

	@FindBy(id="userPassword")
	WebElement passwordEle;

	@FindBy(id="login")
	WebElement submit;

	@FindBy(css="[class*='flyInOut']")
	WebElement errorMsg;

	public ProductCatalouge loginApplication(String email,String password) {
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalouge productCatalouge =new ProductCatalouge(driver);
		return productCatalouge;
	}
	public String getErrorMessage() {
		waitForWebElementToVisible(errorMsg);
		return errorMsg.getText();
	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}

}
