package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.ToolAllocationModule9;
//import com.oneable.utility.Log4j;

public class TC_ToolAllocation_009 extends TC_RequestToolModule_011
{
	//Log4j lg=new Log4j();
	@Test(priority=9)
	public void ToolAllocation() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(2000);
		ToolAllocationModule9 ta=new ToolAllocationModule9(driver);
		ta.ToolAllocationPage();
		//lg.info("Clicked on tool allocation module");
		Thread.sleep(2000);
		ta.ToolAllocationSearchBox("Anaconda");
		//lg.info("Entered chrome in search box");
		
	}

}