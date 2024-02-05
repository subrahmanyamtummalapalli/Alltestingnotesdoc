package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		//for(int i=0;i<3;i++) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://adactinhotelapp.com/");
		//d.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/input")).sendKeys("subbu");
		//d.findElement(By.xpath("//input[@name='username' or @id='username']")).sendKeys("ravi");
		//d.findElement(By.xpath("//input[@name='username']//following::input[@name='password']")).sendKeys("subrahmanyam");
		
		
		//d.findElement(By.xpath("//input[@name='password']//preceding::input[@name='username']")).sendKeys("ramesh");
		//d.findElement(By.xpath("//a[contains(text(),'Register Here')]")).click();
		//d.findElement(By.xpath("//a[contains(text(),'info@adactin.com')]")).click();
		//d.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("davi");
		d.findElement(By.xpath("//a[contains(text(),'New User')]")).click();
		//d.findElement(By.xpath("//*[text()='Forgot Password?']")).click();
		d.close();
		//d.quit();
	//}
	}

}
