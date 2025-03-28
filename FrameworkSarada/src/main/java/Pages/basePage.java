package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	WebDriver driver;
	public basePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForElementVisibility(WebElement e, int time) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(e));
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void enterText(WebElement e, int time, String text) {
		waitForElementVisibility(e,time);
		e.sendKeys(text);
	}
	
	public void clickElement(WebElement e, int time) {
		waitForElementVisibility(e,time);
		e.click();
	}	
	
	
}
