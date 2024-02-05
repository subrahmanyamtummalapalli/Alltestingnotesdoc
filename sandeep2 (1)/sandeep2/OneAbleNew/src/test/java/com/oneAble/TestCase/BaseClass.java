package com.oneAble.TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.oneAble.utility.ReadConfig;

public class BaseClass {
ReadConfig readconfig=new ReadConfig();
	
	//get the url from properties files
	public String baseURL1=readconfig.getApplicationURL();
	
	//get the uname from properties files
	public String username1=readconfig.getUsername();
	
	//get the psw from properties files
	public String password1=readconfig.getPassword();
	
	public static WebDriver driver;

	

//@BeforeMethod
@BeforeClass

	public void loadConfig() throws InterruptedException 
	{
	
 ChromeOptions op=new ChromeOptions();
       op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		Thread.sleep(2000);
		 
		
		driver.get(baseURL1);
		driver.manage().window().maximize();
		}
	//@AfterMethod
@AfterClass
		public void teardown()
		{
			//driver.quit();
}
}
