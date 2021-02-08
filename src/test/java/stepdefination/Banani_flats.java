package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Banani_flats {

	public static WebDriver driver;

	@Given("^I open buyrentbd websitef$")
	public void i_open_buyrentbd_websitef() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("^I click on Banani flatf$")
	public void i_click_on_Banani_flatf() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='home-properties']/div[7]/article/h4/a")).click();

	}

	@When("^I click on nextf$")
	public void i_click_on_nextf() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();

	}

	@When("^verift the textf$")
	public void verift_the_textf() throws Throwable {

		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/p[1]/strong"));

		System.out.println(element.getText());

	}

	@Then("^I close websitef$")
	public void i_close_websitef() throws Throwable {

		driver.quit();

	}

}
