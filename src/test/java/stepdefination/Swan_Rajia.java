package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swan_Rajia {

	public static WebDriver driver;

	@Given("^I open buyrentbd website for Swan Rajia$")
	public void i_open_buyrentbd_website_for_Swan_Rajia() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@Given("^I click on number two link for Swan Rajia$")
	public void i_click_on_number_two_link_for_Swan_Rajia() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='home-properties-section-inner']/div[3]/a[3]")).click();

	}

	@When("^I click on Swan Rajia flat$")
	public void i_click_on_Swan_Rajia_flat() throws Throwable {

		driver.get("https://buyrentbd.com/property/swan-rajia-mention/");

	}

	@When("^I click on next buttons for Swan Rajia$")
	public void i_click_on_next_buttons_for_Swan_Rajia() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();

	}

	@When("^verift the text on the page Swan Rajia$")
	public void verift_the_text_on_the_page_Swan_Rajia() throws Throwable {

		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/p[1]"));

		System.out.println(element.getText());

	}

	@Then("^I close browser for Swan Rajia$")
	public void i_close_browser_for_Swan_Rajia() throws Throwable {

		driver.quit();

	}

}
