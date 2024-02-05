package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG3 {
	public static WebDriver driver;
	@Test(priority=20)
	public void login1()
	{
		driver.findElement(By.name("username")).sendKeys("saikiran147");
		driver.findElement(By.id("password")).sendKeys("Ojas123!");
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful", true);
	}
	@Test(priority=1)
	public void login2()
	{
		driver.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		driver.findElement(By.id("password")).sendKeys("Raghu@12345");
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful", true);
	}
	@BeforeSuite
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void lanch()
	{
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Logout"));
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
	
	

}
