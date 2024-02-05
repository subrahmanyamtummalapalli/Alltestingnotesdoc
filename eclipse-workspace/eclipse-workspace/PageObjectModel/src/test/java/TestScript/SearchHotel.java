package TestScript;

import ReusableMethods.LoginPageMethods;
import ObjectRepository.SearchHotelElements;

import org.openqa.selenium.support.ui.Select;

import ObjectRepository.LoginElements;
public class SearchHotel extends LoginPageMethods{

	public static void main(String[] args) throws Throwable {
		
		SearchHotelElements sh = new SearchHotelElements();
		LoginElements le = new LoginElements();
		
		// Login Page
		loginPage();
		sc1("1.LoginPage");
		driver.findElement(le.UserName).sendKeys("vinaychennuri1");
		driver.findElement(le.PassWord).sendKeys("8187826150");
		driver.findElement(le.Login).click();
		sc1("2.SearchHotel");
		
		// Search Hotel
		Select loc = new Select(driver.findElement(sh.location_D));
		loc.selectByIndex(3);
		Select hotel = new Select(driver.findElement(sh.hotels_D));
		hotel.selectByIndex(2);
		Select RT = new Select(driver.findElement(sh.room_type_D));
		RT.selectByIndex(1);
		Select NOM = new Select(driver.findElement(sh.room_nos_D));
		NOM.selectByIndex(4);
		driver.findElement(sh.datepick_in_S).sendKeys("25/06/2023");
		driver.findElement(sh.datepick_out_S).sendKeys("27/06/2023");
		Select APR = new Select(driver.findElement(sh.adult_room_D));
		APR.selectByIndex(4);
		Select CPR = new Select(driver.findElement(sh.child_room_D));
		CPR.selectByIndex(1);
		driver.findElement(sh.Submit_C).click();
		sc1("3.SelectHotel");
		driver.close();
	}

}
