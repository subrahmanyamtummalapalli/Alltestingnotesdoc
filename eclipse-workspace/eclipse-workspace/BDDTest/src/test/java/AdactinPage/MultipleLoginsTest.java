package AdactinPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleLoginsTest {
	
	public static WebDriver driver;
	
	@Given("^Go to Adactin Login page$")
	public void go_to_adactin_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("^Enter Username as ([^\"]*)$")
	public void un(String Username) {
		driver.findElement(By.name("username")).sendKeys(Username);
	}
	
	@When("^Enter Password as ([^\"]*) and click on login$")
	public void pwd(String Password) {
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}
	
    @Then("^Validate user is able to login$")
    public void validate_user_is_able_to_login()
    {
    	boolean loc = driver.findElement(By.id("location")).isDisplayed();
    	if(loc)
    	{
    		System.out.println("Login Successfull");
    	}
    	else
    	{
    		System.out.println("Login Failed");
    	}
    	
    	driver.close();
    }
    


}
