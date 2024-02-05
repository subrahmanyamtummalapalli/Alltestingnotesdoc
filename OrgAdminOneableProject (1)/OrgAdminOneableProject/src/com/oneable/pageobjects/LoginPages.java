package com.oneable.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.base.BaseClass;
import com.oneable.helpers.Action;
import com.oneable.utility.Log;

public class LoginPages extends BaseClass {
	Action action = new Action();
	
	@FindBy(name="signin-email")
	WebElement emailTextBox;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(name="signin-password")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//i[@class='fa fa-eye-slash   position-absolute PswVeiw  ']")
	WebElement viewPasswordIcon; 
	
	@FindBy(xpath="//button[text()='LOGIN']")
	WebElement loginButton; 
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement forgotPasswordLink; 
	
	@FindBy(xpath="//a[text()='Back']")
	WebElement backButton; 
	
	@FindBy(xpath="//span[text()=\"English \"]")
	WebElement englishText; 
	
	@FindBy(xpath="//span[text()=\"Japanese \"]")
	WebElement JapaneseText; 
	
	@FindBy(xpath="//div[@class='dropdown language-menu']")
	WebElement languageText;
	@FindBy(xpath="//*[text()='dashboard']")
	WebElement DashBoardText;

	public LoginPages() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void login(String email,String pwd) throws InterruptedException {
		Log.info("Enter email");
		action.type(emailTextBox, email);
		Thread.sleep(3000);
		Log.info("click on next button");
		action.click(nextButton);
		Log.info("Enter password");
		action.type(passwordTextBox, pwd);
		Log.info("Click on login button");
		action.click(loginButton);
	}
	public void backToEmailPage(String email) throws InterruptedException {
		Log.info("Enter Email");
		action.type(emailTextBox, email);
		Log.info("Click on next button");
		action.click(nextButton);
		Log.info("Navigated to password page");
		Thread.sleep(3000);
		Log.info("Click on back button");
		action.click(backButton);
		//Log.info("successfully navigated back to email page");
		
		
	}
	public boolean validation() {
		boolean displayed = action.display(getDriver(), DashBoardText);
		return displayed;
	}
	 public void inValidemailWithValidDomain(String email) {
		 action.type(emailTextBox, email);
		 action.click(nextButton);
	 }

	public void text() throws InterruptedException {
		action.mouseOver(getDriver(), languageText);
		Thread.sleep(2000);
		action.click(JapaneseText);
	}
	
	
	
	
	
	
	
	
	
}
