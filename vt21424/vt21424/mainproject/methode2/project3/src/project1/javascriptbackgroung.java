package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptbackgroung {
	public static void background(WebElement element,WebDriver driver) 
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='4px solid green ' ", element);
			}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.guru99.com/introduction-to-cucumber.html");
		d.findElement(By.xpath(""));
		
		

	}

}
