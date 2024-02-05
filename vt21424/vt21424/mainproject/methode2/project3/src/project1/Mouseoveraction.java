package project1;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("https://adactinhotelapp.com/HotelAppBuild2/");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement un=d.findElement(By.name("username"));
		un.clear();
		un.sendKeys("veerasubrahmanyam");
		a.doubleClick(un).perform();
		a.contextClick(un).perform();
		
		Robot r=new Robot();
		for(int i=0;i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			WebElement pwd=d.findElement(By.id("password"));
			
			a.moveToElement(pwd).build().perform();
			
			a.contextClick(pwd).build().perform();
			for(int j=0;j<=4;j++) {
				
				r.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				
				
			}
		r.keyPress(KeyEvent.VK_ENTER);
		d.findElement(By.name("login")).click();
		
		}
		
		
		

	}


