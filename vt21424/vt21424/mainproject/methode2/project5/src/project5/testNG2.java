package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNG2 {
	public static WebDriver driver;
	@Test
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("veerasubrahmanya");
		driver.findElement(By.id("password")).sendKeys("Raghu@12345");
		driver.findElement(By.className("login_button")).click();
		Reporter.log("login is successfull..",true);
	}
	@BeforeSuite
	public void OpenBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@BeforeMethod
	public void lanch()
	{
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}
	@AfterMethod
	public void Logout() {
	driver.findElement(By.linkText("Logout")).click();
	}
	@AfterSuite
	public void CloseBrowser() {
	driver.close();
	}

}
