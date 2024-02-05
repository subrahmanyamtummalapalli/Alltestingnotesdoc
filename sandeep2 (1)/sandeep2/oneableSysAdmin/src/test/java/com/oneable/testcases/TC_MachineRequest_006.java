package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.MachineRequestsModule6;
import com.relevantcodes.extentreports.LogStatus;
//import com.oneable.utility.Log4j;

public class TC_MachineRequest_006 extends TC_LoginTest_001
{
	@Test(priority=3)
	public static void MachineRequestsPage() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Log4j lg = new Log4j();
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(2000);
		MachineRequestsModule6 mr=new MachineRequestsModule6(driver);
		mr.MachineRequests();
		test.log(LogStatus.PASS, "machine Request module clicked successfully");
		//lg.info("Clicked on machine requests module");
		Thread.sleep(2000);
		mr.MachineRequestSearch();
		test.log(LogStatus.PASS,"search the machine request");
		//lg.info("Clicked on search box");
		System.out.println("machine requested successfully");
		//report.endTest(test);
		
		
	}

}
