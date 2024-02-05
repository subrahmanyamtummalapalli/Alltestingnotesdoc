package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelBrowserTest {
	
	public static WebDriver driver;
	
	@Test
	public void chromeLaunch()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	    System.out.println("Chrome successfully launched");
	    driver.close();
	}
	
	@Test
	public void edgeLaunch()
	{
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	    System.out.println("Edge successfully launched");
	    driver.close();
	}

}
