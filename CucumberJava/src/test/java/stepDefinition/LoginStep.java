package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {
	
	WebDriver driver;
	WebDriverWait mywait;
	
	@Given("I launch chrome browser")
	public void user_is_on_login_page() {
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver=new ChromeDriver();
		mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	@When("I open orange hrm homepage")
	public void user_enters_username_and_password() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Then("I verify that the logo present on page")
	public void user_is_navigated_home_page() {
		WebElement img=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='orangehrm-login-logo']/img")));
		boolean status=img.isDisplayed();
		
		Assert.assertEquals(status,true);
	}
	@And("close browser")
	public void clicks_on_login_button() {
	   driver.quit();
	}
}
