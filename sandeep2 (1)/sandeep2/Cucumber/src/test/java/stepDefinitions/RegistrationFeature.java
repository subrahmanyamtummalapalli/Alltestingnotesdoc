package stepDefinitions;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFeature {

    static WebDriver driver;

//    @Before
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Given("user navigates to registration page")
    public void user_navigates_to_registration_page() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    }

    @When("user enters below details")
    public void user_enters_below_details(DataTable data) {
        Map<String, String> info = data.asMap(String.class, String.class);
        driver.findElement(By.name("firstname")).sendKeys(info.get("firstname"));
        driver.findElement(By.name("lastname")).sendKeys(info.get("lastname"));
        driver.findElement(By.name("email")).sendKeys(info.get("email"));
        driver.findElement(By.name("telephone")).sendKeys(info.get("telephone"));
        driver.findElement(By.name("password")).sendKeys(info.get("password"));
        driver.findElement(By.name("confirm")).sendKeys(info.get("confirm"));
    }

    @And("clicks on privacy policy checkbox")
    public void clicks_on_privacy_policy_checkbox() {
        driver.findElement(By.name("agree")).click();
    }

    @And("clicks on continue button")
    public void clicks_on_continue_button() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
    }

    @Then("user registered into account successfully message should be displayed")
    public void user_registered_into_account_successfully_message_should_be_displayed() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
    }

//    @Given("Clicks on login button1")
//    public void clicks_on_my_account_login_button() {
//        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
//    }
//
//    @When("^user enters valid username(.*)$")
//    public void user_enters_valid_username(String un) {
//       
//        WebElement ele = driver.findElement(By.xpath("//input[@name=\"email\"]"));
//        ele.sendKeys(un);
//    }
//
//    @And("^user enters valid password(.*)$")
//    public void user_enters_valid_password(String pwd) {
//       
//        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pwd);
//    }
//
//    @And("Clicks on login button")
//    public void clicks_on_login_button() {
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//    }
//
//    @Then("Successful message should be displayed")
//    public void successful_message_should_be_displayed() {
//        System.out.println("home");
//    }
}