package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	public static WebDriver driver;
	@Test(dataProvider="login")
	public void login(String un,String pwd) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful",true);
		driver.close();
		
	}
	@DataProvider(name="login")
	public Object[][] logindata()
	{
	Object data[][]= 
	{{"saikiran147","Ojas123!"},{"Thippesh","thippesh"},{"tulasidevi","tulasidevi"}};
	return data; 
	}

}

