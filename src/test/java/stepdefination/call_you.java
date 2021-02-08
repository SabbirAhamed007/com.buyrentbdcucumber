package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class call_you {
	
	public static WebDriver driver;
	
	@Given("I open buyrentbd website")
	public void i_open_buyrentbd_website() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");


		
	}

	@When("I enter name on let us call you form")
	public void i_enter_name_on_let_us_call_you_form() {
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("cfos-name")).clear();
		driver.findElement(By.id("cfos-name")).sendKeys("Sabbir" + currentTime);


		
	}

	@When("email")
	public void email() {
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("cfos-email")).clear();
		driver.findElement(By.id("cfos-email")).sendKeys("Sabbirahamedcs@gmail.com" + currentTime);
		


		
		
	}

	@When("phone number")
	public void phone_number() {
		
		driver.findElement(By.id("cfos-number")).sendKeys("8622324967");


		
		
	}

	@Then("I enter message")
	public void i_enter_message() {
		
		
		driver.findElement(By.id("cfos-message")).sendKeys("Welcome!!!  Cucumber maven extended report.");


		
	}

	@Then("close the browser")
	public void close_the_browser() {
		
		driver.quit();


		
	}



}
