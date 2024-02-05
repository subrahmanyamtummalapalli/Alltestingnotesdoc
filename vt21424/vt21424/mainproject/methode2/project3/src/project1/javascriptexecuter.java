package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecuter {
	public static void drawBorderele(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='4px solid green ' ", element);
		}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.firstcry.com/");
       WebElement parent=d.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[3]/ul/li[6]/a"));
        WebElement child=d.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[3]/ul/li[4]/a"));
       javascriptexecuter.drawBorderele(parent, d);
       javascriptexecuter.drawBorderele(child, d);
	}




}
