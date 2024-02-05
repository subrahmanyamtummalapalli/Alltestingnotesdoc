package com.oneable.testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.MachineListGaragePage2;
//import com.oneable.utility.Log4j;

public class Tc_MachineLIstGarage_002 extends TC_ProvisioningOfMachinesPage_003{
	@Test(priority=7)
	public void machinelist() throws Exception {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Log4j lg = new Log4j();
//		LoginPage1 lp = new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		MachineListGaragePage2 mlg = new MachineListGaragePage2(driver);
		ReusableMethods rm=new ReusableMethods();
		
		mlg.clickMachineListButton();
		Thread.sleep(2000);
//		boolean countmachine = mlg.countmachine();
//		Assert.assertTrue(countmachine);
		//Thread.sleep(2000);
	   mlg.clickSearch();
	   Thread.sleep(3000);
	   mlg.clickRoundBar();
	   Thread.sleep(3000);
	   mlg.clickDeactive();
	
		//lg.info("Click on search box");
		
	}

}
