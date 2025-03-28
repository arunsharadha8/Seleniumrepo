package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basePage{

	// 1. Page Elements 
	
	// 3. Page constructor
	public loginPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(id="user-name")
	private WebElement userName;

	@FindBy(name= "password")
	private WebElement pwd;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	//2. Page Actions
	
	public void enterUsername(String username) {
		enterText(userName, 2, username);
	}
	
	public void enterPassword(String password) {
		enterText(pwd, 3, password);
	}
	
	public void clickLogin() {
		clickElement(loginBtn, 2);
	}
	
	
	
	
	
	
	
	
}
