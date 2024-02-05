package project5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITclass {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebElement element;
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ra21005\\Desktop\\501\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//Actions obj = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@Class='uploadResume resman-btn-primary resman-btn-small']")).click();
		Thread.sleep(3000);
		//obj.doubleClick(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button"))).build().perform();
		
		Runtime.getRuntime().exec("C:\\Users\\vt21424\\Desktop\\subbu122.exe");
		Thread.sleep(2000);
		driver.close();

	}

}
