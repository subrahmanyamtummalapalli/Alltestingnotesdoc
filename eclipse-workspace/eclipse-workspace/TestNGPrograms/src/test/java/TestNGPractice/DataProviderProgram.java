package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderProgram {
	public static WebDriver driver;

	
	@DataProvider(name = "run")
	public Object[][] data() {
		return new Object[][] {
			{"vinaychennuri1", "8187826150"},
			{"Thippesh", "Thippesh"},
			{"saikiran147", "Ojas123!"}
		};
		
	}
	
	@Test(dataProvider = "run")
	public void test(String username, String password) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.close();

	}

}
