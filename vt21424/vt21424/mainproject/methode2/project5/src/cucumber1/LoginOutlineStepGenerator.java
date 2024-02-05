package cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginOutlineStepGenerator {
	public static WebDriver driver;
	@Given ("^Open login page$")
	public void launchapp() 
	{
		driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}
@When("^Enter username as([^\"]*)$")

public void un (String un)
{
	driver.findElement(By.name("username")).sendKeys(un);
}
@When("^Enter password as([^\"]*) and click on login button$")
public void pwd (String pwd)
{
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.name("login")).click();
	}
@Then("^Home page$")
public void Home() {
	boolean x= driver.findElement(By.name("location")).isDisplayed();
	if(x) 
	{
		System.out.println("Login is sucessful");
	} 
	else
	{
		System.out.println("Login is failed");
	}
	
	driver.close();
}

}
