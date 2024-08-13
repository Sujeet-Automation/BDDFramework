package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryModel {

    WebDriver driver;

	@FindBy(id = "Email")
	public WebElement EmailID;
	@FindBy(id = "Password")
	public WebElement Password;
	@FindBy(css = "button[type='submit']")
	public WebElement Submit;
	
	public PageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

}
