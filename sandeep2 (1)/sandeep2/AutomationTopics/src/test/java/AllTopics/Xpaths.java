package AllTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
    public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//driver.findElement(By.name("email")).sendKeys("sandy1519467852@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sandy1519467852@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("sandeep");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("sandeep");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	}

}
