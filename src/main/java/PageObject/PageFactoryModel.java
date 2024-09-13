package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryModel {

    WebDriver driver;

    @FindBy(xpath = "(//*[@class='avatar mx-auto white'])[6]")
	public WebElement BooksAPPs;
    @FindBy(xpath = "//*[text()='Book Store Application']")
	public WebElement BooksAPPs1;
    @FindBy(xpath = "(//*[text()='Login'])[1]")
	public WebElement Loginclick;
	@FindBy(id = "userName")
	public WebElement userName;
	@FindBy(xpath = "//*[@id='password']")
	public WebElement Password;
	@FindBy(xpath = "//*[@id='login']")
	public WebElement login;
	 @FindBy(xpath = "//*[text()='Log out']")
	public WebElement LogOut;
	
	
	public PageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

}
