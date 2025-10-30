package vinay.AbstractComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import vinay.pageobjects.CartPage;
import vinay.pageobjects.OrderPage;

public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(css="button[routerLink*='/dashboard/cart']")
	WebElement cart;

	@FindBy(css="button[routerLink='/dashboard/myorders']")
	WebElement order;
	By goToCart = By.cssSelector("button[routerLink*='/dashboard/cart']");

	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	public void waitForWebElementToAppear(List<WebElement> findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(findBy));
	}
	public void waitForWebElementToVisible(WebElement findBy) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(findBy));
	}
	public void waitForElementToDisappear() throws InterruptedException {
		Thread.sleep(1000);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	public CartPage goToCartPage() {
		waitForElementToAppear(goToCart);
		cart.click();
		CartPage cartPage =new CartPage(driver);
		return cartPage;
	}
	public OrderPage goToOrdersPage() {

		order.click();
		OrderPage orderPage =new OrderPage(driver);
		return orderPage;
	}



}
