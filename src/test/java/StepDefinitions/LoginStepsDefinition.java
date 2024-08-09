package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepsDefinition {
	static WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("https://motor.rqbeonline.co.in/");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.id("Email")).sendKeys("sujeet");
		driver.findElement(By.id("Password")).sendKeys("test@123");
	}

	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		String Title = driver.getTitle();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
