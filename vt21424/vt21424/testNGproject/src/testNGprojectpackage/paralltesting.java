package testNGprojectpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paralltesting {

public static void main(String[] args) {
//	int a[]= {1,2,3,4,5};
//	for(int i=a.length;i>=0;i--)
//	{
//		System.out.println(i);
//	}
//	StringBuilder a=new StringBuilder("1,2,3,4,5,6");
//	
//	StringBuilder m=a.reverse();
//	System.out.println(m);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	String prent=driver.getWindowHandle();
	System.out.println(prent);
	for(int i=0;i<=3;i++)
	{
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	}
	Set<String> handles = driver.getWindowHandles();
	System.out.println(handles);
	for(String i:handles)
	{
	while(!i.equals(handles))
	{
		
	
	driver.switchTo().window(i);
	
	}
	System.out.println("successfully");
}
		
	}
}
