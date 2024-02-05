package TestScript;
import POM.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import POM.SearchHotelPO;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHotelTS {
	
	public WebDriver driver;
	
	@BeforeTest()
	public void launchApp()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void runTest()
	{
		PageObjects po = new PageObjects(driver);
		po.crediantials("veerasubbu", "veerasubbu");
		po.loginData();
	
		// Search Hotel
		SearchHotelPO shp = new SearchHotelPO(driver); 
		shp.loc("London");
		shp.hotel(2);
        shp.RoomT("Super Deluxe");
        shp.RoomNu("6");
        shp.CID("29/06/2023");
        shp.COD("30/06/2023");
        shp.APR(3);
        shp.CPR();
        shp.screenShot(driver, "Search Hotel");
        driver.findElement(By.id("Submit")).click();
			
	}

}
