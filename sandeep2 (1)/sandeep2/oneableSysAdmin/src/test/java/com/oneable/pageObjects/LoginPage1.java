package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.testcases.BaseClass;
import com.oneable.testcases.ReusableMethods;
//import com.oneable.utility.Log4j;

public class LoginPage1 
{
	//Log4j lg=new Log4j();
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//img[@class='dropdown-toggle w26 cursor-pointer']")
//	WebElement LanguageSelection;
//	
//	@FindBy(id="englishSelection")
//	WebElement English;
	
	@FindBy(xpath="//input[@class=\"form-control borderlg\" or @name=\"signin-email\"]")
	WebElement TextUserName;
	
	@FindBy(xpath="//button[@class=\"btn bg_indgo text-white mt-4 px-4\" or name=\"emailSubmite\"]")
	WebElement Button;
	
	@FindBy(xpath="//input[@class=\"form-control borderlg\" or name=\"userPassword\"]")
	WebElement TextPassword;
	
	@FindBy(xpath="//button[@name=\"login-Button\" or text()='LOGIN']")
	WebElement ButtonLogin;
	
//	public void LanguageOption() throws Exception
//	{
//		rm.click(LanguageSelection);
//		//lg.info("Clicked on language selection");
//		Thread.sleep(5000);
//		rm.click(English);	
//		//lg.info("Clicked on japanese language");
//		
//	}
	
	public void LoginWithValidData(String uname, String pwd) throws Exception
	{
		rm.type(TextUserName, uname);
		//lg.info("Username is entered successfully");
		Thread.sleep(2000);
		rm.click(Button);
		//lg.info("Clicked on Next");
		Thread.sleep(2000);
		rm.type(TextPassword, pwd);
		//lg.info("Password is entered successfully");
		Thread.sleep(2000);
		rm.click(ButtonLogin);
		//lg.info("Clicked on login button");
	}
	
	public void LoginWithInvalidUserName() throws Exception
	{
		rm.type(TextUserName, "praveen.kandikonda@ojas-it.com");
		//lg.info("Entered invalid username");
		Thread.sleep(2000);
		rm.click(Button);
		//lg.info("Clicked on Next button");
	}
	
	public void LoginWithValidUnameInvalidPsw() throws Exception
	{
		rm.type(TextUserName,"praveenkumar.kandikonda@ojas-it.com");
		//lg.info("Entered valid username");
		Thread.sleep(2000);
		rm.click(Button);
		//lg.info("Clicked on next button");
		Thread.sleep(2000);
		rm.type(TextPassword, "Pravi123");
		//lg.info("Entered invalid password");
		Thread.sleep(2000);
		rm.click(ButtonLogin);
		//lg.info("Clicked on login button");
	}
	
	public void WithOutUnameClickOnBitton()
	{
		rm.click(Button);
		//lg.info("Clicked on next button");
	}
	
	public void ValidUnameAndWithOutPwd() throws Exception
	{
		rm.type(TextUserName,"praveenkumar.kandikonda@ojas-it.com");
		//lg.info("Entered Valid username");
		Thread.sleep(2000);
		rm.click(Button);
		//lg.info("Clicked on next button");
		Thread.sleep(2000);
		rm.click(ButtonLogin);
		//lg.info("Clicked on login button");
	}
}
