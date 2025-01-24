package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryModel {

    WebDriver driver;

    @FindBy(xpath = "(//*[@class='avatar mx-auto white'])[6]")
	private WebElement BooksAPPs;
    @FindBy(xpath = "//*[text()='Book Store Application']")
    private WebElement BooksAPPs1;
    @FindBy(xpath = "(//*[text()='Login'])[1]//ancestor::div[@class='element-list collapse show']")
    private WebElement Loginclickvisible;
    @FindBy(xpath = "(//*[text()='Login'])[1]")
    private WebElement Loginclick;
	@FindBy(id = "userName")
	private WebElement userName;
	@FindBy(xpath = "//*[@id='password']")
	private WebElement Password;
	@FindBy(xpath = "//*[@id='login']")
	private WebElement login;
	@FindBy(xpath = "//*[text()='Log out']")
	private WebElement LogOut;
	
	
	public PageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}


	public WebElement getBooksAPPs() {
		return BooksAPPs;
	}
	
	public WebElement getBooksAPPs1() {
		return BooksAPPs1;
	}

	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLoginclickvisible() {
		return Loginclickvisible;
	}


	public WebElement getLoginclick() {
		return Loginclick;
	}


	public WebElement getLogOut() {
		return LogOut;
	}


	public WebElement getLogin() {
		return login;
	}

}
