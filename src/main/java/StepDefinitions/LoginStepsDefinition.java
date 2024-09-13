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
	
	PageFactoryModel object = new PageFactoryModel(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^I am on the page URL \"([^\"]*)\"$")
	public void i_am_on_the_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}
	
	@Then("^Click on Book Store Application$")
	public void Click_on_Book_Store_Application() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,650)", "");
        wait.until(ExpectedConditions.elementToBeClickable(object.BooksAPPs)).click();
		js.executeScript("window.scrollBy(0,650)", "");
		wait.until(ExpectedConditions.elementToBeClickable(object.BooksAPPs1)).click();
	}

	@Then("Click on Login")
	public void Click_on_login() throws InterruptedException {
		js.executeScript("window.scrollBy(0,650)", "");
		if(object.Loginclick.isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOf(object.Loginclick)).click();
			
		}
		else {
			wait.until(ExpectedConditions.visibilityOf(object.BooksAPPs1)).click();
			object.BooksAPPs1.click();
			wait.until(ExpectedConditions.visibilityOf(object.Loginclick)).click();
			object.Loginclick.click();
		}
		
	}
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		js.executeScript("window.scrollBy(0,650)", "");
		object.userName.sendKeys(username);
		object.Password.sendKeys(password);
	}

	@When("Click on Login Button")
	public void click_on_login_button() throws InterruptedException {
		js.executeScript("window.scrollBy(0,650)", "");
		object.login.click();
	}

	@Then("Click on Login Logout")
	public void Click_on_Logout() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(object.LogOut));
		js.executeScript("window.scrollBy(0,250)", "");
		//*[@class='rt-tr']//div[@class='rt-resizable-header-content']
		String abc=driver.findElement(By.xpath("//*[@class='rt-tr']")).getText();
		System.out.println(abc);
		object.LogOut.click();
	}

}
