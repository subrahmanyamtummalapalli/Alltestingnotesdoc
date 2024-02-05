package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.RequestToolModule11;
//import com.oneable.utility.Log4j;

public class TC_RequestToolModule_011 extends Tc_MachineLIstGarage_002 
{
	//Log4j lg=new Log4j();
	@Test(priority=8)
	public void RequestTool() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(2000);
		RequestToolModule11 rtm=new RequestToolModule11(driver);
		rtm.RequestToolModulePage();
		//lg.info("Clicked on request module");
		Thread.sleep(2000);
		rtm.RequestToolSearchBox("Notepad");
		//lg.info("Entered notepad in search box");
		Thread.sleep(2000);
		//rtm.LogoutLink();  
		//lg.info("Clicked on logout functionality");
	}

}
