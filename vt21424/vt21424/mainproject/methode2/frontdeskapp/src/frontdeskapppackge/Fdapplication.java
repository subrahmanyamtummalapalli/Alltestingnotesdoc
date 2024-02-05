package frontdeskapppackge;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Fdapplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get("https://ojasit.darwinbox.com/");
		driver.findElement(By.xpath("//*[@id=\"UserLogin_username\"]")).sendKeys("veerasubrahmanyam.tummalapalli@Ojas-it.com");
		driver.findElement(By.xpath("//*[@id=\"UserLogin_password\"]")).sendKeys("Raghu@1234567");
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/nav/div[1]/div/div[10]/div/a/div/img")).click();
		//driver.findElement(By.id("a61b7322832298")).click();
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File login=ts.getScreenshotAs(OutputType.FILE);
//		Files.copy(login,new File("C:\\Users\\vt21424\\Desktop\\subbu\\firstone\\images.png"));
		//Files.copy(Login, new File("D:\\screenshort.png"));
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
