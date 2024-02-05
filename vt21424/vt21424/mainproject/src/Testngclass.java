import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testngclass {
	public static WebDriver driver;
	@Test(priority=1)
	public void login1()
	{
		driver.findElement(By.name("username")).sendKeys("saikiran147");
		driver.findElement(By.id("password")).sendKeys("Ojas123!");
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful", true);
		String e=driver.getTitle();
		Assert.assertEquals("thippesh", "e");
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
	@Test(priority=3)
	public void login2()
	{
		driver.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		driver.findElement(By.id("password")).sendKeys("Raghu@12345");
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful", true);
	}
	@Test(priority=2)
	public void login3()
	{
		driver.findElement(By.name("username")).sendKeys("Thippesh");
		driver.findElement(By.id("password")).sendKeys("Thippesh");
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful", true);
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
