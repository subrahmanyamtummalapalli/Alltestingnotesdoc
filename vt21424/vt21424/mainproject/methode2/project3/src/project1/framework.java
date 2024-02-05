package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://adactinhotelapp.com/");
		d.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		d.findElement(By.id("password")).sendKeys("Raghu@12345");
		d.findElement(By.className("login_button")).click();

	}

}
