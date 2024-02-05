package com.oneAble.TestCase;

import org.testng.annotations.Test;

import com.oneAble.PageObjects.LoginPage;
import com.oneAble.PageObjects.ReUsableMethods;

public class Login_001 extends BaseClass {
 @Test(priority=1)
 public void credentials()
 {
	ReUsableMethods rm=new ReUsableMethods() ;
	LoginPage lp=new LoginPage(driver);
	lp.setUn(username1);
	lp.next();
	lp.setPwd(password1);
	lp.clickSubmit();
 }
}
	