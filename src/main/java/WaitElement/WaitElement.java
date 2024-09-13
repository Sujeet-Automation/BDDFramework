package WaitElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitElement {
private WebDriver driver;
	
	public WaitElement(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForElement(WebElement element,int i){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
