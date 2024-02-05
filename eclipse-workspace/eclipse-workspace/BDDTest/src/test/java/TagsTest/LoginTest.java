package TagsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public WebDriver driver;
	
	@Given("^Login to websitee$")
	public void Login_to_website() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
}
	
	@When("^Enter username and password$")
	public void Enter_username_and_password()
	{
		driver.findElement(By.id("username")).sendKeys("vinaychennuri1");
		driver.findElement(By.id("password")).sendKeys("9947WJ");
	}
	
	@Then("^I validate the outcomes$")
	public void  I_validate_the_outcomes()
	{
		driver.findElement(By.id("login")).click();
	}
}