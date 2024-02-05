package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class ClassOne {
	public static WebDriver driver;
	@Parameters("browser")
	
	
	@Test
	 
	
	public void login(String browser)
	
	
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("WebDriver.chrome.driver","‪C:\\Users\\vt21424\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adactin.com/HotelAppBuild2/");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "‪C:\\Users\\vt21424\\Downloads\\geckodriver-v0.31.0-win64");
			driver=new FirefoxDriver();
			driver.get("http://adactin.com/HotelAppBuild2/");
			driver.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
			driver.findElement(By.id("password")).sendKeys("Raghu@12345");
			driver.findElement(By.className("login_button")).click();
		}
	}

}
