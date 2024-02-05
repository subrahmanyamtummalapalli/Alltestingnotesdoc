package LaunchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.out.println("enter the browser name:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(str.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.findElement(By.name("email")).sendKeys("sandy1519467852@gmail.com");
			driver.findElement(By.name("password")).sendKeys("sandeep");
			driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
			
		
		}
		else if(str.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.findElement(By.name("email")).sendKeys("sandy1519467852@gmail.com");
			driver.findElement(By.name("password")).sendKeys("sandeep");
			driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		}
		else if(str.equals("edge"))
		{
			driver=new EdgeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.findElement(By.name("email")).sendKeys("sandy1519467852@gmail.com");
			driver.findElement(By.name("password")).sendKeys("sandeep");
			driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		}
		else
		{
			System.out.println("no browser");
		}

	}

}
