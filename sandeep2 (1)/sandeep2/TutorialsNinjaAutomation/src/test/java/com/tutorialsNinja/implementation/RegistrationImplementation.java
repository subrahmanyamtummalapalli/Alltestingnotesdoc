package com.tutorialsNinja.implementation;

import org.testng.annotations.Test;

import com.tutorialsNinja.pageObjects.RegistrationPage;

public class RegistrationImplementation extends BaseClass{
	
	@Test(priority=1)
	public void register() throws Exception
	{
		RegistrationPage rp=new RegistrationPage(driver);
		rp.getMyAccount();
		Thread.sleep(2000);
		rp.getRegisterDetails();
		Thread.sleep(2000);
		rp.getFirstName("sandeep");
		Thread.sleep(2000);
		rp.getLastName("velpula");
		Thread.sleep(2000);
		rp.getEmail("sandeep2a@gmail.com");
		Thread.sleep(2000);
		rp.getTelephoneNum("1234567890");
		Thread.sleep(2000);
		rp.getPwd("sandeep2a");
		Thread.sleep(2000);
		rp.getCnfPwd("sandeep2a");
		Thread.sleep(2000);
		rp.getCheckBox();
		Thread.sleep(2000);
		rp.clickSubmit();
	}

}

