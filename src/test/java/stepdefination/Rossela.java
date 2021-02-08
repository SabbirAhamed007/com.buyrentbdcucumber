package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rossela {

	public static WebDriver driver;

	@Given("^I open buyrentbd website for Rosselas$")
	public void i_open_buyrentbd_website_for_Rosselas() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@Given("^I click on number two linkse$")
	public void i_click_on_number_two_linkse() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='home-properties-section-inner']/div[3]/a[2]")).click();

	}

	@When("^I click on Rossela flate$")
	public void i_click_on_Rossela_flate() throws Throwable {

		driver.get("https://buyrentbd.com/property/bddl-rossella-3-bed-bddl-ready-apt-at-west-dhanmondi-3rd-floor/");

	}

	@When("^I click on next buttons for Rosselae$")
	public void i_click_on_next_buttons_for_Rosselae() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();

	}

	@When("^verift the text on the page Rosselae$")
	public void verift_the_text_on_the_page_Rosselae() throws Throwable {

		WebElement element = driver
				.findElement(By.xpath("//div[contains(text(),'Address: Walking distance from Nizam Shankar Plaza')]"));

		System.out.println(element.getText());

	}

	@Then("^I close browser for Rosselae$")
	public void i_close_browser_for_Rosselae() throws Throwable {

		driver.quit();

	}

}
