package com.tutorialsNinja.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsNinja.implementation.BaseClass;

public class LoginPage extends BaseClass {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement MyAccountBtn;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    WebElement LoginBtn;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(name = "password")
    WebElement paswordField;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn2;

    

    public void ClickmyAccount() {
        if (MyAccountBtn != null) {
            MyAccountBtn.click();
        } else {
            System.out.println("not clicking");
        }
    }

    public void clickLoginBtn() {
        LoginBtn.click();
    }

    public void getEmailText(String email) {
        emailField.sendKeys(email);
    }

    public void getPwdText(String pwd) {
        paswordField.sendKeys(pwd);
    }

    public void clickLogin() {
        loginBtn2.click();
    }

//    public void maximize() {
//        driver.manage().window().maximize();
//    }
}
