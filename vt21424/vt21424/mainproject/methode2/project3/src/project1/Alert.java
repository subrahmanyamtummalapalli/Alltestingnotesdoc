package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		//driver.findElement(By.className(""))
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

	}

}
