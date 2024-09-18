package WaitElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitElement {
private WebDriver driver;
	
	public WaitElement(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForElementvisibilityOf(WebElement element,int i){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
    public void WaitForelementToBeClickable(WebElement element,int i){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
    public boolean isElementPresent(WebElement locatorKey) {
        try {
        	locatorKey.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
