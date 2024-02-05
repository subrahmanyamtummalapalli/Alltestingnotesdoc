package project5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handalwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		d.findElement(By.linkText("Help")).click();
		String a=d.getWindowHandle();
		System.out.println("firstid:"+a);
		Set<String> twoids=(d.getWindowHandles());
		for(String i:twoids) {
			
			if(!i.equals(a)) {
				
				System.out.println("second id: "+i);
				d.switchTo().window(i);
				d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
				d.switchTo().window(a);
				d.close();
				d.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
				//d.quit();
				
				
				
			}
		}
		
		
		
		

	}

}
