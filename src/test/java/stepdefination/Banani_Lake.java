package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Banani_Lake {

	public static WebDriver driver;

	@Given("^I open buyrentbd websites(\\d+)$")
	public void i_open_buyrentbd_websites(int arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("^I click on Banani Lake flat$")
	public void i_click_on_Banani_Lake_flat() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='home-properties']/div[10]/article/h4/a")).click();

	}

	@When("^I click on next button(\\d+)$")
	public void i_click_on_next_button(int arg1) throws Throwable {

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();

	}

	@When("^verift the text on it(\\d+)$")
	public void verift_the_text_on_it(int arg1) throws Throwable {

		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/p[1]"));

		System.out.println(element.getText());

	}

	@Then("^I close(\\d+)$")
	public void i_close(int arg1) throws Throwable {

		driver.quit();

	}

}
