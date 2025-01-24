package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.PageFactoryModel;
import TestBase.TestBase;
import WaitElement.WaitElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsDefinition extends TestBase {
	WaitElement wait=new WaitElement(driver);
	PageFactoryModel object = new PageFactoryModel(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^I am on the page URL \"([^\"]*)\"$")
	public void i_am_on_the_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}
	
	@Then("^Click on Book Store Application$")
	public void Click_on_Book_Store_Application() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,650)", "");
		wait.WaitForElementvisibilityOf(object.getBooksAPPs(),5);
        object.getBooksAPPs().click();
		js.executeScript("window.scrollBy(0,650)", "");
		wait.WaitForElementvisibilityOf(object.getBooksAPPs1(),5);
        object.getBooksAPPs1().click();
		
	}

	@And("Click on Login")
	public void Click_on_login() throws InterruptedException {
		js.executeScript("window.scrollBy(0,650)", "");
		if(wait.isElementPresent(object.getLoginclickvisible())==true) {
			wait.WaitForElementvisibilityOf(object.getLoginclick(), 5);
	        object.getLoginclick().click();	
		}
		else if(wait.isElementPresent(object.getLoginclickvisible())==false) {
			wait.WaitForElementvisibilityOf(object.getBooksAPPs1(),5);
	        object.getBooksAPPs1().click();
	        wait.WaitForElementvisibilityOf(object.getLoginclick(),5);
	        object.getLoginclick().click();
		}
		
	}
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		js.executeScript("window.scrollBy(0,650)", "");
		object.getUserName().sendKeys(username);
		object.getPassword().sendKeys(password);
	}

	@And("Click on Login Button")
	public void click_on_login_button() throws InterruptedException {
		js.executeScript("window.scrollBy(0,650)", "");
		object.getLogin().click();
	}

	@Then("Click on Logout Button")
	public void Click_on_Logout() throws InterruptedException {
		wait.WaitForElementvisibilityOf(object.getLogOut(),5);
		js.executeScript("window.scrollBy(0,250)", "");
		//*[@class='rt-tr']//div[@class='rt-resizable-header-content']
		String abc=driver.findElement(By.xpath("//*[@class='rt-tr']")).getText();
		System.out.println(abc);
		object.getLogOut().click();
	}

}
