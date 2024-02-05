package grouplavelpacage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Holeapptestng {
	public static WebDriver driver;
	@BeforeSuite
	public void Browseropen() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@BeforeClass
	public void lauchapp() 
	{
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
	@Test(priority=-1)
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Thippesh");
		driver.findElement(By.id("password")).sendKeys("Thippesh");
		driver.findElement(By.className("login_button")).click();
		
	}
	
	
	 @Test(priority=1)
	 public void login1()
	 {
		 driver.findElement(By.name("username")).sendKeys("anushagorala");
			driver.findElement(By.id("password")).sendKeys("Anusha@123");
			driver.findElement(By.className("login_button")).click();
		 
	 }
	 @AfterSuite
		public void closebrowser()
		{
			driver.close();
		}
	

}
