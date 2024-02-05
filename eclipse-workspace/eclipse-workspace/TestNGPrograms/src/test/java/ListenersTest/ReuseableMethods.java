package ListenersTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReuseableMethods {
	
	public static WebDriver driver;
	
	public static void loginPage()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	    System.out.println("Chrome successfully launched");
	    driver.close();
	}
	
	public static void failedSc(String fileName)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ab = ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(ab, new File("C:\\Users\\vc21352\\eclipse-workspace\\TestNGPrograms\\Screenshots\\" + fileName + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
