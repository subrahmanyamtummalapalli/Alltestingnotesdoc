package helperpackges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable {
	public static WebDriver driver;
	public static void lanchapp()
	
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vt21424\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		
	}
	public void close()
	{
		driver.close();
	}

}
