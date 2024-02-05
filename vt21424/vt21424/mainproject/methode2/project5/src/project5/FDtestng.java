package project5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FDtestng {
	public static WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get("https://frontdesk.corp.ojas-it.com");
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Admin");
	     driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Ojas1525");
	     driver.findElement(By.name("btn_login")).click();
	}
	

}

