package cucumberpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepsgenerator {
	public static WebDriver driver;
	@Given("^Open adactin build2 login page$")
	public void launchapp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}
	@When("^Enter valid username$")
	public void un()
	{
		driver.findElement(By.name("username")).sendKeys("Thippesh");
	}
	@When("^Enter valid password$")
	public void pwd()
	{
		driver.findElement(By.name("password")).sendKeys("Thippesh");
	} 
	@When("^click on login button$")
	public void clickloginbutton() 
	{
		driver.findElement(By.name("login")).click();
	}
	@Then("^Navigate to Home$")
	public void Home() 
	{
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
