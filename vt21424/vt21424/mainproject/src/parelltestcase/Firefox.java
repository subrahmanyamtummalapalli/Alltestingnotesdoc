package parelltestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox extends Chrome{
	
	public static WebDriver driver;
	@Test
	public void firefox() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	
		System.setProperty("Webdriver.gecko.driver", "‪C:\\Users\\vt21424\\Downloads\\geckodriver-v0.31.0-win64");
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("anushagorala");
		driver.findElement(By.id("password")).sendKeys("Anusha@123");
		driver.findElement(By.id("login")).click();
		
		
	}
}


