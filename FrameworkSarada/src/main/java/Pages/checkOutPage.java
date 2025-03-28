package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPage extends basePage{

	public checkOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="finish")
	private WebElement finish;
	
	public void clickFinish() {
		finish.click();
	}
	
	
	
	
	
	
	
	
}
