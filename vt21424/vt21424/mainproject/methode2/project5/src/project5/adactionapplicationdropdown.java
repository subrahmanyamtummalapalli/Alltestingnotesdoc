package project5;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactionapplicationdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int count=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.name("username")).sendKeys("SravaniGorijavolu1");
		driver.findElement(By.name("password")).sendKeys("sravaniraja");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();


		Select location=new Select(driver.findElement(By.id("location")));

		java.util.List<WebElement> op = location.getOptions();
		int size = op.size();

		for(int i =1; i<size ; i++)
		{
		String options= op.get(i).getText();
		Boolean o=options.startsWith("L");
		if(options.startsWith("L")==true)
		{
		count++;
		System.out.println(options.toString());

		}
		}
		System.out.println(count);
		
		

	}

}
