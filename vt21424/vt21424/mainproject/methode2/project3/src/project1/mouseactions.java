package project1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class mouseactions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Actions a=new Actions(d);
		d.get("https://adactinhotelapp.com/HotelAppBuild2/");
		TakesScreenshot ts=(TakesScreenshot)d;
		
		File Login= ts.getScreenshotAs(OutputType.FILE);
		Files.copy(Login, new File("D:\\screenshort.png"));
		WebElement un=d.findElement(By.id("username"));
		un.sendKeys("veerasubrahmanyam");
		a.doubleClick(un).perform();
		a.contextClick(un).perform();
		//Thread.sleep(3000);
		Robot r=new Robot();
		for(int i=0;i<=2;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement pwd=d.findElement(By.id("password"));
		a.moveToElement(pwd).perform();
		a.contextClick(pwd).perform();
		for(int j=0;j<=4;j++) 
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		d.findElement(By.id("login")).click();
		
		
	}

}
