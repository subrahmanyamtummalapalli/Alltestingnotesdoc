package com.tutorialsNinja.implementation;

import org.testng.annotations.Test;

import com.tutorialsNinja.pageObjects.LoginPage;

public class LoginPageImplementation extends RegistrationImplementation {

    @Test(priority=2)
    public void login() throws Exception {
        LoginPage lg = new LoginPage(driver);
        lg.ClickmyAccount(); // Ensure ClickmyAccount is called before interacting with the dropdown

        // Assuming 'My Account' dropdown is located by its xpath
//        WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']/parent::li/child::ul"));
//        
//        Select se = new Select(myAccountDropdown);
//        se.selectByIndex(1);
          Thread.sleep(2000);
        lg.clickLoginBtn();
        Thread.sleep(2000);
        lg.getEmailText("sandeep3a@gmail.com");
        Thread.sleep(2000);
        lg.getPwdText("sandeep3a");
        Thread.sleep(2000);
        lg.clickLogin();
    }
}