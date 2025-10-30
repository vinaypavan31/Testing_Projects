
package vinay.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vinay.AbstractComponents.AbstractComponent;

public class ProductCatalouge extends AbstractComponent {
	WebDriver driver;

	public ProductCatalouge(WebDriver driver) {
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".mb-3")
	List<WebElement> products;

	@FindBy(css=".ng-animating")
	WebElement spinner;


	By productsBy=By.cssSelector(".mb-3");
	By addToCart=By.xpath("//button[contains(text(),'Add')]");
	By toastMessage=By.cssSelector("#toast-container");


	public List<WebElement> getProductList() {
		waitForWebElementToAppear(products);
		//System.out.println(products);
		return products;
	}


	public  WebElement getProductByName(String productName) {
		WebElement prod= getProductList().stream()
			    .filter(product ->
			        product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
			    .findFirst().orElse(null);
		System.out.println(prod+" Hello");
		return prod;
	}

	public CartPage addProductToCart(String productName) throws InterruptedException {

		WebElement prod=getProductByName(productName);
		prod.findElement(addToCart).click();
		waitForElementToAppear(toastMessage);
		waitForElementToDisappear();
		CartPage cartPage=new CartPage(driver);
		return cartPage;
	}





}
