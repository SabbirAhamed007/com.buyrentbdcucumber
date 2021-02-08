package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gold_Place {

	public static WebDriver driver;

	@Given("^I open buyrentbd website for test$")
	public void i_open_buyrentbd_website_for_test() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("^I click on BDDL Gold flat$")
	public void i_click_on_BDDL_Gold_flat() throws Throwable {

		driver.findElement(By.xpath("//div/a[@class='real-btn' and 2]")).click();

		driver.get(
				"https://buyrentbd.com/property/bddl-gold-palace-%e0%a6%ac%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%8f%e0%a6%b2-%e0%a6%97%e0%a7%8b%e0%a6%b2%e0%a7%8d%e0%a6%a1-%e0%a6%aa%e0%a7%8d%e0%a6%af%e0%a6%be%e0%a6%b2%e0%a7%87/");

	}

	@When("^I click on the next$")
	public void i_click_on_the_next() throws Throwable {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("^verift text$")
	public void verift_text() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']/p[1]"));

		System.out.println(element.getText());

	}

	@Then("^I close it$")
	public void i_close_it() throws Throwable {

		driver.quit();

	}

}
