package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature {
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
	@Given("Clicks on login button1")
    public void clicks_on_my_account_login_button1() throws InterruptedException {
		Thread.sleep(5000);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        System.out.println("login button clicked");
    }

    @When("^user enters valid username(.*)$")
    public void user_enters_valid_username(String un) throws InterruptedException {
    	Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        ele.sendKeys(un);
        System.out.println("username entered");
    }

    @And("^user enters valid password(.*)$")
    public void user_enters_valid_password(String pwd) throws InterruptedException {
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pwd);
    }

    @And("Clicks on login button")
    public void clicks_on_login_button() throws InterruptedException {
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    }

    @Then("Successful message should be displayed")
    public void successful_message_should_be_displayed() {
        System.out.println("home");
    }
}
