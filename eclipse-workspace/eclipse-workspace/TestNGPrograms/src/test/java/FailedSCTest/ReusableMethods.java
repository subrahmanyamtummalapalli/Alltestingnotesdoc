package FailedSCTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	}
	
	@AfterMethod
	public void stop() 
	{
		driver.close();
}
}