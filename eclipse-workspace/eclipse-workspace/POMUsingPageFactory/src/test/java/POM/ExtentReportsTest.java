package POM;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
public class ExtentReportsTest {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
	
	ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extentReports.html");
	
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(htmlReport);
	
	ExtentTest test1 = extent.createTest("Adactin Page", "Validate the user login");
	
	WebDriverManager.chromedriver().setup();
	
	test1.log(Status.INFO, "Initializing the chrome browser");
    driver = new ChromeDriver();
    test1.pass("Successfully initialized");
    
	driver.get("https://adactinhotelapp.com/index.php");
	test1.pass("Open Adactin page");
	
	driver.manage().window().maximize();
	
	driver.close();
	test1.pass("closed browser");
	
	extent.flush();
	

}
}