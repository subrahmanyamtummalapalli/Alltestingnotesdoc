package com.tutorialsNinja.implementation;

import org.testng.annotations.Test;

import com.tutorialsNinja.pageObjects.MyAccount;

public class MyAccountImplementation extends LoginPageImplementation{
	
	@Test(priority=3)
	public void muAccount() throws InterruptedException
	{
		MyAccount m=new MyAccount(driver);
		m.accountDropmenu();
		Thread.sleep(5000);
		m.accountBtn();
		System.out.println("successful");
		Thread.sleep(2000);
		m.editBtn();
		Thread.sleep(2000);
		m.fname("sandeep2a");
		Thread.sleep(2000);
		m.lname("velpula2a");
		Thread.sleep(2000);
		m.emailId("sandeep3a@gmail.com");
		Thread.sleep(2000);
		m.phnNum("4567");
		Thread.sleep(2000);
		m.submit1();
		Thread.sleep(2000);
		m.changePwd();
		Thread.sleep(2000);
		m.pwd("sandeep3a");
		Thread.sleep(2000);
		m.cPwd("sandeep3a");
		Thread.sleep(2000);
		m.clickContinue();
		
		m.address();
		
		m.newaddress();
	}

}
