import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnushaRakesh {
	
	public static WebDriver driver;
@BeforeSuite
public void openbrowser()
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");


	}
@Test
public void login()
{
	driver.findElement(By.id("username")).sendKeys("anushagorala");
	driver.findElement(By.className("login_input")).sendKeys("Anusha@123");
	driver.findElement(By.id("login")).click();
}

@AfterSuite
	public void close()
	{
		driver.close();
	}
	
}
