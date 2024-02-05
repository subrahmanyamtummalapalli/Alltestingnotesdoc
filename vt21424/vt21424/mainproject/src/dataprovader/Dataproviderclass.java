package dataprovader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderclass {
@Test(dataProvider="login")
public void login(String un,String pwd)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotecom/HotelAppBuild2/index.php");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("login")).click();
	Reporter.log("successfully");
	driver.close();
	}
@DataProvider(name="login")
public Object[][] logindata()
{
	
	Object array[][]= {{"veerasubrahmanyam","Raghu@12345"},{"saikiran147","Ojas123!"}};
	return array;
}

}
