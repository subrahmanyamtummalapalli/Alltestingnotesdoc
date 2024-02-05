package AdactinLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	public static WebDriver driver;

	@Given("User is able to test login functionality")
	public void user_is_able_to_test_login_functionality() throws Throwable 
	
	{	
     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vc21352\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
	}

	@When("User enters the Username and Password")
	public void user_enters_the_username_and_password() 
	{
        System.out.println("User enters the Username and Password");
	}

	@When("click on login button")
	public void click_on_login_button() 
	{
		System.out.println("click on login button");
	}

	@Then("User able to navigate Search hotel page")
	public void user_able_to_navigate_search_hotel_page() 
	{
		System.out.println("User able to navigate Search hotel page");
	}

}
