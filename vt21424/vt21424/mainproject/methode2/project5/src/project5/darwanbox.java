package project5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class darwanbox {

	public static void main(String[] args) throws InterruptedException {
		
	
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://ojasit.darwinbox.com/user/login");
//		driver.findElement(By.xpath("//*[@id=\"UserLogin_username\"]")).sendKeys("veerasubrahmanyam.tummalapalli@ojas-it.com");
//		driver.findElement(By.cssSelector("#UserLogin_password")).sendKeys("Raghu@1234567");
//		driver.findElement(By.xpath("/html/body/div[1]/form/div/div[5]/div[2]/button")).click();
//		
//		driver.findElement(By.cssSelector("#pulse_form > div > div > div > div.action-btns.mt-32 > button.btn.btn-secondary.ripple.db-btn.plr-32.mr-12.skip_pulse")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='Attendance']")).click();	
//		System.out.println("successfull");
//		Thread.sleep(2000);
//		driver.quit();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ojasit.darwinbox.com/user/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"UserLogin_username\"]")).sendKeys("veerasubrahmanyam.tummalapalli@ojas-it.com");
		driver.findElement(By.id("UserLogin_password")).sendKeys("Raghu@1234567");
		driver.findElement(By.name("login-submit")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/nav/div[1]/div/div[10]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/section/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/a[2]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1300);");
	}

}
