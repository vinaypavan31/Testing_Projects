package vinay.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vinay.AbstractComponents.AbstractComponent;

public class LastPage extends AbstractComponent {
	WebDriver driver;
	@FindBy(css = ".hero-primary")
	WebElement thanksmsg;

	public LastPage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getThanksMessage() {
		String thanksMessage = thanksmsg.getText();
		return thanksMessage;
	}
}
