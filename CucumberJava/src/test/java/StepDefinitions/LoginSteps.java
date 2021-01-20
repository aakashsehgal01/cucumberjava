package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	WebDriver driver=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	System.out.println("user is on login page");
	System.getProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver_win32_ver87\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters uname and pass");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicks on login");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("navigates to home page");
	}



}
