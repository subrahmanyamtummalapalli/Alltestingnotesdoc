package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

public static WebDriver driver;
	
	@Test
	public void assertTest()
	{
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://adactinhotelapp.com/");
    String url = driver.getCurrentUrl();
    System.out.println("App URL: "+ url);
    Assert.assertEquals(driver.getCurrentUrl(), url);
	driver.findElement(By.name("username")).sendKeys("vinaychennuri1");
	driver.findElement(By.name("password")).sendKeys("8187826150");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	System.out.println("App Title: "+title);
	Assert.assertEquals(driver.getTitle(), title);
	driver.close();
	}

}
