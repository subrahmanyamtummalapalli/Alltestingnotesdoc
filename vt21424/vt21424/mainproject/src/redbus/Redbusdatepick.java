package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbusdatepick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.redbus.com/");
		d.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("kakinada");
		d.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("hydrabad");
		d.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		

	}

}
