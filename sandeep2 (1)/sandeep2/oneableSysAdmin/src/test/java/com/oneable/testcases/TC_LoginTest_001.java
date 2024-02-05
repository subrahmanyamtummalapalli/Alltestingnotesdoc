package com.oneable.testcases;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.relevantcodes.extentreports.LogStatus;
//import com.oneable.pageobjects.LoginPage1;
//import com.oneable.utility.Log4j;

public class TC_LoginTest_001 extends BaseClass {

	ReusableMethods rm = new ReusableMethods();
	// Log4j lg = new Log4j();

	//@Test(priority = 1)
	public void VerifyLanguage() throws Exception {
		LoginPage1 lp = new LoginPage1(driver);
		//lp.LanguageOption();
		test.log(LogStatus.PASS, "language button selected");
	}

	@Test(priority = 1)
	public void LoginTestWithValidData() throws Exception {
		Thread.sleep(2000);

		LoginPage1 lp = new LoginPage1(driver);
		lp.LoginWithValidData(username, password);
		test.log(LogStatus.PASS,"Logged into the application");
		// lg.info("Login with valid credentials");
		Thread.sleep(3000);
		if (driver.getTitle().equals("Oneable Workforce Planner")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		System.out.println("logged in successfully");
	}

//	@Test(priority=3)
//	public void LoginTestWithInvalidUserName() throws Exception {
//		com.oneable.pageObjects.LoginPage1 lp = new com.oneable.pageObjects.LoginPage1(driver);
//		lp.LoginWithInvalidUserName();
//	}
//
//	@Test(priority=4)
//	public void LoginTestWithValidUnameInvalidPwd() throws Exception {
//		com.oneable.pageObjects.LoginPage1 lp = new com.oneable.pageObjects.LoginPage1(driver);
//		lp.LoginWithValidUnameInvalidPsw();
//	}
//
//	@Test(priority=5)
//	public void WithOutUsernameClickOnButton() throws Exception {
//		com.oneable.pageObjects.LoginPage1 lp = new com.oneable.pageObjects.LoginPage1(driver);
//		Thread.sleep(2000);
//		lp.WithOutUnameClickOnBitton();
//	}
//
//	@Test(priority=6)
//	public void VerifyWithUnameAndWithOutPwd() throws Exception {
//		com.oneable.pageObjects.LoginPage1 lp = new com.oneable.pageObjects.LoginPage1(driver);
//		Thread.sleep(2000);
//		lp.ValidUnameAndWithOutPwd();
//	}
}
