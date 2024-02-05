package com.oneable.testcases;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LogOutPage;


public class TC_LogOut_012 extends TC_Toolist_007 {
	@Test(priority=13)
	public void logout()
	{
		LogOutPage lop=new LogOutPage(driver);
	    lop.LogoutLink();
	    lop.clickyes();
	}
}
