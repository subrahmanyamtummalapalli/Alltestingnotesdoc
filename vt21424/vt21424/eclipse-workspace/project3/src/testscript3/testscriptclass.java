package testscript3;

import org.openqa.selenium.By;

import helper1.Reusebilityyy;
import pageobjectmodel.Login;

public class testscriptclass extends Reusebilityyy{
	public static void main(String[] args) {
		lanchapppp();
		Login lo=new Login();
		//closeee close=new closeee();
		driver.findElement(By.id("username")).sendKeys("anushagorala");
		driver.findElement(By.id("password")).sendKeys("Anusha@123");
		driver.findElement(By.id("login")).click();
		
	}

}
