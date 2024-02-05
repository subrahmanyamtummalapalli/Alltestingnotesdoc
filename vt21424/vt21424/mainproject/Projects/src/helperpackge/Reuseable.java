package helperpackge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reuseable {
	public static WebDriver driver;
	public static void lanchapp() 
	{
		//System.setProperty("Weddriver.Chrome.driver", "‪C:\\Users\\vt21424\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
public static void close() 
{
driver.close();	
}
	
	}


