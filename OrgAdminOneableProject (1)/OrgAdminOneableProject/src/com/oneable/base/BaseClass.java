package com.oneable.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.oneable.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop;
	//public static WebDriver driver;
	
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	@BeforeSuite
	public void beforeSuite() {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"./configuration//config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}
@BeforeMethod
	public static void launchApp() {
		
		String browserName = prop.getProperty("browser");
		if (browserName.contains("chrome")) {
			 WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			
		} else if (browserName.contains("firfox")) {
			 WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.contains("IE")) {
			 WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
		}
		getDriver().manage().window().maximize();
        getDriver().get(prop.getProperty("url"));

	}
	 @AfterMethod
	 public static void closeApp() {
		 getDriver().close();
	 }
	 @AfterSuite
		 public void afterSuite() {
			 ExtentManager.endReport();
		 }
}
