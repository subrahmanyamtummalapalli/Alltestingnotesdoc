package com.tutorialsNinja.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.tutorialsNinja.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig rc=new ReadConfig();
			
	public String baseurl=rc.getUrl();
	public String baseUsername=rc.getUsername();
	public String basePwd=rc.getPassword();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void launchApp() throws Exception
	{
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	
	
	

}
