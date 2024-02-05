package testscript;

import org.openqa.selenium.support.ui.Select;

import helperpackge.reusebleMethodes;
import pageObject.SearchHotelobjects;
import pageObject.SelectHotelPageObjects;
import pageObject.loginpageObject;

public class SearchaHotel extends reusebleMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginpageObject login=new loginpageObject();
		SearchHotelobjects  search=new SearchHotelobjects();
		SelectHotelPageObjects SelectHotel=new SelectHotelPageObjects();
		lanchapp();
		driver.findElement(login.UsernameTextBox).sendKeys("Kasi1996");
				driver.findElement(login.PwdTextBox).sendKeys("Kasi1996");
				driver.findElement(login.loginButton).click();
				Select location=new Select(driver.findElement(search.LocationListBox));
				location.selectByIndex(3);
				Select noofrooms=new
				Select(driver.findElement(search.noofroomsListBox));
				noofrooms.selectByIndex(2);
				driver.findElement(search.CheckIndateTextBox).clear();
				driver.findElement(search.CheckIndateTextBox).sendKeys("02/03/2022");
				driver.findElement(search.CheckOutDateTextBox).clear();
				driver.findElement(search.CheckOutDateTextBox).sendKeys("03/03/2022");
				Select adult=new Select(driver.findElement(search.AdultsperroomListBox));
				adult.selectByIndex(2);
				driver.findElement(search.SearchButton).click();
				driver.findElement(SelectHotel.LogutLink).click();
				CloseBrowser();

	}

}
