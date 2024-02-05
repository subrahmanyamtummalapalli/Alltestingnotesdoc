package helperpackge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reusebleMethodes {
	public static WebDriver driver;
	public static void lanchapp()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ra21005\\Desktop\\501\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
	public static void CloseBrowser()
	{
	driver.close();
	}
}


