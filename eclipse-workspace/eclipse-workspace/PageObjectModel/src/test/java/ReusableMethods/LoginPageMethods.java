package ReusableMethods;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageMethods {
	
	public static WebDriver driver;
	
	public static void loginPage()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	}
	
	public static void sc(String scName) throws Throwable
	{
	     
		TakesScreenshot ob 	=	(TakesScreenshot)driver;
	    File obj=ob.getScreenshotAs(OutputType.FILE);	    
	    Files.copy(obj, new File("C:\\Users\\vc21352\\eclipse-workspace\\PageObjectModel\\ScreenShot\\LoginPage\\" +scName+ ".jpg"));
		
	}
	
	public static void sc1(String scName1) throws Throwable
	{
	     
		TakesScreenshot ob 	=	(TakesScreenshot)driver;
	    File obj=ob.getScreenshotAs(OutputType.FILE);	    
	    Files.copy(obj, new File("./"+"ScreenShot\\SearchHotelPage\\" +scName1+ ".jpg"));
		
	}
	
	
}
