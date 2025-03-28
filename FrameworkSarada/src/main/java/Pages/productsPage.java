package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends basePage {

	//1. Page Elements
	public productsPage(WebDriver driver) {
super(driver);
	}
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	@FindBy(id="item_0_title_link")
	private WebElement bikeLight;
	
	
	//Page actions
	public void clickBackPack() {
		backPack.click();
	}
	
	public void clickBikeLight() {
		bikeLight.click();
	}
	
	
	
	
	
	
	//2. Page actions
	
	
}
