package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import helperpackge.Reuseable;
import pageobjects.Close;
import pageobjects.Loginpageobject;
import pageobjects.SearchHotelpageObjects;

public class Testscript extends Reuseable {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loginpageobject obj1=new Loginpageobject();
		SearchHotelpageObjects obj2=new SearchHotelpageObjects();
		Close obj3=new Close();
		lanchapp();
		
		driver.findElement(obj1.usernametextbox).sendKeys("anushagorala");
		driver.findElement(obj1.password).sendKeys("Anusha@123");
		driver.findElement(obj1.login).click();
		Select loc=new Select(driver.findElement(obj2.loation));
		loc.selectByIndex(3);
		Select hotels=new Select(driver.findElement(obj2.hotels));
		hotels.selectByIndex(3);
		Select roomtpe=new Select(driver.findElement(obj2.roomtype));
		roomtpe.selectByIndex(1);
		driver.findElement(obj3.close).click();
		
	}

}
