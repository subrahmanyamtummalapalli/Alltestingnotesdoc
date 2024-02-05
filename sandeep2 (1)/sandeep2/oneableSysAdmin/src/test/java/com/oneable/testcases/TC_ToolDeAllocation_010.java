package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.ToolDeAllocationModule10;
//import com.oneable.utility.Log4j;

public class TC_ToolDeAllocation_010 extends TC_ToolAllocation_009
{
	//Log4j lg=new Log4j();
	@Test(priority=10)
	public void DeAllocationPageModule() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(3000);
		ToolDeAllocationModule10 tda= new ToolDeAllocationModule10(driver);
		tda.DeAloocationModule();
		//lg.info("Clicked on de allocation module");
		Thread.sleep(3000);
		tda.DeAllocationSearchBox("Chrome");
		//lg.info("Entered chrome in search box");
	}

}
