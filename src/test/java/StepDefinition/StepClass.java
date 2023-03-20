package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClass {
	WebDriver driver;

	@Given("launch the browser")
	public void launch_the_browser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);

		driver.get("https://demo.cyclos.org/ui/login");
		// user gets the title of the page
	}

	@And("username and password and click submit")
	public void username_and_password_and_click_submit() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User']"));
		username.sendKeys("demo");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
	}

	@And("enter to login page with vaild credentials")
	public void enter_to_login_page_with_vaild_credentials() {
		driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
		System.out.println("Login Succesfully");
		driver.close();
	}
	@Given("launch the browsers")
	public void launch_the_browsers() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);

		driver.get("https://demo.cyclos.org/ui/login");
		// user gets the title of the page
	}

	@And("username and password and click submits")
	public void username_and_password_and_click_submits() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User']"));
		username.sendKeys("demo");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
	}

	@And("enter to login page with vaild credentialss")
	public void enter_to_login_page_with_vaild_credentialss() {
		driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
		System.out.println("Login Succesfully");
		driver.close();
	}
	@Given("click the payuser button")
		public void click_the_payuser_button() {
			WebElement payment = driver.findElement(By.xpath("//div[text()=' Pay user ']"));
			payment.click();
			}

	@When("enter the user name in search field")
	public void enter_the_user_name_in_search_field() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement p = driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
		p.sendKeys("n");
		WebElement list = driver.findElement(By.xpath("//a[@class='select-option autocomplete-option-0']"));
		list.click();
	}

	@And("enter the user amount to be send")
	public void enter_the_user_amount_to_be_send() {

		WebElement amount = driver.findElement(By.xpath("//input[contains(@id,'id')]"));
		amount.clear();
		amount.sendKeys("200");

	}

	@And("Write a discription amount send or not")
	public void write_a_discription_amount_send_or_not() {

		WebElement desc = driver.findElement(By.xpath("//textarea[@id='id_6']"));
		desc.sendKeys("Amount added successfully");
	}

	@And("click the next button to redirect page")
	public void click_the_next_button_to_redirect_page() {

		WebElement next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		next.click();

	}

	@Then("verify once all details correct then click to confirm button")
	public void verify_once_all_details_correct_then_click_to_confirm_button() {

		WebElement conf = driver.findElement(By.xpath("//span[normalize-space()='Confirm']"));
		conf.click();
		driver.close();
	}

}
