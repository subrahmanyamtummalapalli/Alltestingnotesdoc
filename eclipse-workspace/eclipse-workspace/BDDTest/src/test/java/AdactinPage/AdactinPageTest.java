package AdactinPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinPageTest {
	
	public static WebDriver driver;
		
		@Given("^Navigate to login page$")
		public void navigate_to_login_page() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://adactinhotelapp.com/");
		}

		@When("^Enter Username$")
		public void enter_username() {
			driver.findElement(By.name("username")).sendKeys("vinaychennuri1");
		}

		@When("^Enter Password$")
		public void enter_password() {
			driver.findElement(By.name("password")).sendKeys("8187826150");
		}

		@When("^Click on Login$")
		public void click_on_login() {
			driver.findElement(By.name("login")).click();
		}

		@Then("Validate user is able to login Successfully")
		public void validate_user_is_able_to_login_successfully() {
		    boolean loc = driver.findElement(By.id("location")).isDisplayed();
		    if(loc)
		    {
		    	System.out.println("Login Successfull");
		    }
		    else
		    {
		    	System.out.println("Login Failed");
		    }
		}

		@Given("Select all dropdowns in search hotel")
		public void select_all_dropdowns_in_search_hotel() {
		    
			Select loc = new Select(driver.findElement(By.id("location")));
			loc.selectByIndex(1);
			
			Select hot = new Select(driver.findElement(By.id("hotels")));
			hot.selectByIndex(1);
			
			Select RT = new Select(driver.findElement(By.id("room_type")));
			RT.selectByIndex(1);
			
			Select NOM = new Select(driver.findElement(By.id("room_nos")));
			NOM.selectByIndex(1);
			
			Select CR = new Select(driver.findElement(By.id("child_room")));
			CR.selectByIndex(1);
			
			Select AR = new Select(driver.findElement(By.id("adult_room")));
			AR.selectByIndex(1);
			
		}

		@When("Click on search button")
		public void click_on_search_button() {
		    driver.findElement(By.id("Submit")).click();
		}

		@Then("Validate user is able to search hotel")
		public void validate_user_is_able_to_search_hotel() {
		  boolean con = driver.findElement(By.id("continue")).isDisplayed();
		  if(con)
		  {
			  System.out.println("Search Success");
		  }
		  else
		  {
			  System.out.println("search fail");
		  }
		}

	}


