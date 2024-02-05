package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flashingjavascript {
	public static void flash(WebElement element,WebDriver driver) throws InterruptedException 
	{
	 String bgcolor=element.getCssValue("backgroundColor");
	 for(int i=0;i<40;i++)
		 {
		 changeColor("#FFFF00",element,driver);
		 changeColor(bgcolor,element,driver);
		 }
	}

	public static void changeColor(String color,WebElement element,WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://jqueryui.com/droppable/");
		WebElement download=d.findElement(By.xpath("//*[@id=\"menu-top\"]/li[2]/a"));
		flashingjavascript.flash(download, d);
		

	}

}
