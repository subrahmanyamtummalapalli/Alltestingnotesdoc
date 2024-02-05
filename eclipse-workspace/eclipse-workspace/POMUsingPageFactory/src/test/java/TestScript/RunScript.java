package TestScript;
import POM.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunScript {
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReport);
		
		ExtentTest test1 = extent.createTest("Adactin Page", "Validate the user login");
				
		WebDriverManager.chromedriver().setup();
		
		test1.log(Status.INFO, "Initializing the chrome browser");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
	    test1.pass("Successfully initialized Adactin Page");

		
		PageObjects pageobjects = new PageObjects(driver);
		
		pageobjects.crediantials("veerasubbu", "veerasubbu");
		
		pageobjects.loginData();
	    test1.pass("Successfully Logged in");
	    
	    driver.close();
		test1.pass("closed browser");
		
		extent.flush();

	}

}
