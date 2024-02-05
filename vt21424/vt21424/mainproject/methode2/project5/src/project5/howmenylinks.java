package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class howmenylinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		 WebElement link=driver.findElement(By.tagName("a"));
		 link = (WebElement) link.getSize();
		 System.out.println(link);
		 
	}

}
