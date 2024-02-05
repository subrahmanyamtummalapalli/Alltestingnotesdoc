package AdactinPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	
	@Given("^user is login page$")
	public void user_is_login_page() {
        WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	}

	@When("^enter username and password$")
	public void enter_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("vinaychennuri1");
		driver.findElement(By.name("password")).sendKeys("8187826150");
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("^user is able to navigate to homepage$")
	public void user_is_able_to_navigate_to_homepage() {	
		boolean loc = driver.findElement(By.id("location")).isDisplayed();
	    driver.close();

		if(loc) 
		{
	    System.out.println("Login Successfull");
	    }
		else
		{
			System.out.println("Login Failed");
		}

}
}