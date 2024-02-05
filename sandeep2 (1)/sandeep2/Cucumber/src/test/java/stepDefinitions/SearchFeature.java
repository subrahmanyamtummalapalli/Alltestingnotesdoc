package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFeature {
	WebDriver driver;
	@Before
    public void setUp() {
        driver = new ChromeDriver();
       // driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");
	   System.out.println("given");
	   driver.findElement(By.name("search")).click();
	}

	@When("user clicks on search box field")
	public void user_clicks_on_search_box_field() {
	   System.out.println("when");
	}

	@And("enter data in searchbox field")
	public void enter_data_in_searchbox_field() {
	   System.out.println("and");
	}

	@Then("Specified product details display")
	public void specified_product_details_display() {
	    System.out.println("then");
	}
}
