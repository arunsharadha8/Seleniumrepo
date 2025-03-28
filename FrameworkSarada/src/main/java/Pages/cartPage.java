package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends basePage{
	
	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement remove;
	
	public void clickRemove() {
		remove.click();
	}
	
	public void clickCheckout() {
		checkout.click();
	}
	
	
	

}
