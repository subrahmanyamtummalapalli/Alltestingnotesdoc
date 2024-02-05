package parelltestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	public static WebDriver driver;
	@Test
	public void  chromdriver()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("anushagorala");
		driver.findElement(By.id("password")).sendKeys("Anusha@123");
		driver.findElement(By.id("login")).click();
		
	}
	
	

}
