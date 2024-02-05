package ReuasbleMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHotelPage {
	
	public static WebDriver driver;
	
	public static void launchSite()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/hotels/");
        driver.navigate().refresh();

	}
	
	
}
