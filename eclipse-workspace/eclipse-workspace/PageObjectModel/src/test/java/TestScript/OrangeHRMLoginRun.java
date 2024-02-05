package TestScript;
import PageFactoryElements.OrangeHRMLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginRun {
	public WebDriver driver;
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		OrangeHRMLogin orl = new OrangeHRMLogin(driver);
		orl.loginPage();
				
	}
}
