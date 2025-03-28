package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends basePage {
	
	public productDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="add-to-cart")
	private WebElement addToCartBtn;
	
	@FindBy(name="remove")
	private WebElement rem;
	
	@FindBy(className= "shopping_cart_badge")
	private WebElement cartLogo;
	
	public void clickaddToCart() {
		addToCartBtn.click();
	}

	public void clickRemove() {
		rem.click();
	}
	
	public void clickCartLogo() {
		cartLogo.click();
	}
	

}
