package helper1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusebilityyy {
	public static WebDriver driver;
	public static void lanchapppp()
	
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
	}
	public static void closeee()
	{
		driver.close();
	}

}
