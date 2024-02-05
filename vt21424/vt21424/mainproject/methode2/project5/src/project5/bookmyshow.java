package project5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bookmyshow {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();

	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
	driver.findElement(By.xpath("//*[text()='Action/Drama']")).click();
	//driver.findElement(By.id("wzrk-confirm")).click();
	driver.findElement(By.xpath("//*[@id=\"page-cta-container\"]/button/div")).click();
	driver.findElement(By.xpath("//a[@class='showtime-pill']")).click();
	driver.findElement(By.xpath("//*[text()='Accept']")).click();
	driver.findElement(By.id("proceed-Qty")).click();
	driver.findElement(By.xpath("//*[@class='_available']")).click();
	driver.findElement(By.xpath("//*[@id=\"btmcntbook\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"btmcntbook\"]")).click();
	driver.findElement(By.xpath("//*[@id='prePay']")).click();
	//driver.switchTo().alert().accept();
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("//*[@id=\"wzrk-confirm\"]")).click();
	//driver.switchTo().alert().accept();
	//Thread.sleep(5000);
	//driver.quit();
}
}
