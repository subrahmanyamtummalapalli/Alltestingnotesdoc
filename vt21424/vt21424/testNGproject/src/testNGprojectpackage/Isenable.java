package testNGprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).isDisplayed();
		System.out.println("okd");
		driver.findElement(By.id("username")).isEnabled();
		System.out.println("oke");
		driver.findElement(By.id("username")).isSelected();
		System.out.println("oks");
		
		

	}

}
