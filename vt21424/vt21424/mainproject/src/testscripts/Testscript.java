package testscripts;

import helperpackges.Reusable;
import pageobjects.Close;
import pageobjects.loginfun;

public class Testscript extends Reusable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lanchapp();
		loginfun login=new loginfun();
		
		driver.findElement(login.emailusername).sendKeys("subbu9949393449@gmail.com");
		driver.findElement(login.next).click();
		driver.findElement(login.password).sendKeys("9949393449");
		driver.findElement(login.next1).click();
		
		Close cl=new Close();
		driver.findElement(cl.closee).click();
		

	}

}
