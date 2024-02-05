package com.oneable.testcases;



//import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.oneable.utility.ReadConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {
	//Log4j lg=new Log4j();
	//create object for ReadConfig class
	ReadConfig readconfig=new ReadConfig();
	
	//get the url from properties files
	public String baseURL=readconfig.getApplicationURL();
	
	//get the uname from properties files
	public String username=readconfig.getUsername();
	
	//get the psw from properties files
	 String password=readconfig.getPassword();
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	
	//@Parameters("browser")
	//@BeforeMethod
	@BeforeClass
	public void loadConfig() throws Exception 
	{
       // report=new ExtentReports("./ExtendReports/sandeep.html");
//        report=new ExtentReports("./ExtendReports/aaaa.png");
//        test=report.startTest("loginPage");
		driver=new ChromeDriver();
		Thread.sleep(5000);
		 
		
		driver.get(baseURL);
		Thread.sleep(3000);
		//test.log(LogStatus.PASS, "launch the browser");
		driver.manage().window().maximize();
		//test.log(LogStatus.PASS, "maximize the browser");
		}
//	@AfterClass
//		public void teardown()
//		{
//			driver.quit();
//			report.endTest(test);
//}
}