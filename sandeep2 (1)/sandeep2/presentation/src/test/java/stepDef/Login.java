package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
static WebDriver driver;

@Before
public void launch()
{
	driver=new ChromeDriver();
	System.out.println("browser launched");
}
@After
public void tearDown()
{
	driver.quit();
	System.out.println("quit the browser");
}
@BeforeStep
public void navigateToLoginPage()
{
	System.out.println("ENTER INTO THE STEP");
}
@AfterStep
public void everyStep()
{
	System.out.println("EXIT FROM THE STEP");
}
@Given("user navigates to login page")
public void user_navigates_to_login_page() {
	driver=new ChromeDriver();
	driver.get("https://ojas.oneable.ai/");
    
  
}

@When("user enters valid email as <email>")
public void user_enters_valid_email_as_email() {
	driver.findElement(By.name("signin-email")).sendKeys("sandeep.velpula@ojas-it.com");;
    
}

@And("user clicks on next button")
public void user_clicks_on_next_button() {
	driver.findElement(By.name("next")).click();
    
}

@And("user enters valid password as <pwd>")
public void user_enters_valid_password_as_pwd() {
	driver.findElement(By.name("signin-password")).sendKeys("Test123$");
    
}

@And("clicks on login button")
public void clicks_on_login_button() {
	driver.findElement(By.name("login-Button")).click();
    
}

@Then("Home Page displayed")
public void home_page_displayed() {
    System.out.println("homePage displayed");

}}