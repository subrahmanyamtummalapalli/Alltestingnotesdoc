package TestScript;
import POM.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import POM.SearchHotelPO;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHotelTS {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test1;
	
	 @BeforeTest()
     public void launchBrowser() throws Throwable
     {
	    ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extentReports.html");
	    extent = new ExtentReports();	
	    extent.attachReporter(htmlReport);	
	    test1 = extent.createTest("Adactin Page", "Validate the user login");

        	SearchHotelPO sc = new SearchHotelPO(driver);
        	WebDriverManager.chromedriver().setup();
    	    driver = new ChromeDriver();
    		test1.log(Status.INFO, "Initializing the chrome browser");
    		driver.get("https://adactinhotelapp.com/index.php");
    		driver.manage().window().maximize();
    		test1.pass("Open Adactin page");
    		sc.screenShot(driver, "adactin Page");
        }
        
        @Test()
        public void runScript() throws Throwable
        {
		PageObjects po = new PageObjects(driver);
        po.crediantials("veerasubbu", "veerasubbu");
        SearchHotelPO shp = new SearchHotelPO(driver);
        shp.screenShot(driver, "Login Page");
        po.loginData();
        test1.pass("User Successfully Login");
        
        test1.log(Status.INFO, "Navigated to Search Hotel Page");
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
        test1.pass("Navigated to Select Hotel Page");
        }
        
        @AfterTest()
        public void clean() throws Throwable
        {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#radiobutton_0")).click();
        driver.quit();
        test1.pass("Browser Closed");
        extent.flush();
        }
	}

