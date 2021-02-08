package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Jonota_housing {

	public WebDriver driver;

	@Given("^I open buyrentbd websites$")
	public void i_open_buyrentbd_websites() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("^I click on jonota housing flat$")
	public void i_click_on_jonota_housing_flat() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='home-properties']/div[8]/article/h4/a")).click();

	}

	@When("^I click on next button$")
	public void i_click_on_next_button() throws Throwable {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();
		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("^verift the text on it$")
	public void verift_the_text_on_it() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']/p[1]"));

		System.out.println(element.getText());

	}

	@Then("^I close$")
	public void i_close() throws Throwable {

		driver.quit();

	}

}
