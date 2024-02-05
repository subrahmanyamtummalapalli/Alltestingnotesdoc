package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
		d.findElement(By.cssSelector("#username")).sendKeys("veerasubrahmanyam");
		d.findElement(By.cssSelector("input[id='password']")).sendKeys("Raghu@12345");
		d.findElement(By.cssSelector("input#login")).click();
		d.findElement(By.cssSelector("a[href='ChangePassword.php']")).click();
		d.navigate().back();
		d.findElement(By.cssSelector(".search_combobox")).sendKeys("london");
		d.findElement(By.cssSelector("#hotels']")).sendKeys("Hotel Hervey");
		

	}

}
