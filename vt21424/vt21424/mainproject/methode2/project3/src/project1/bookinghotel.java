package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bookinghotel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String arrayname[] = {"veerasubrahmanyam","Raghu@12345"};
		//for(int i=0;i<2;i++) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://adactinhotelapp.com/");
		//d.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		//d.findElement(By.id("password")).sendKeys("Raghu@12345");
		d.findElement(By.className("login_button")).click();
		d.findElement(By.name("location")).sendKeys("Melbourne");
		d.findElement(By.name("hotels")).sendKeys("Hotel Sunshine");
		new Select(d.findElement(By.name("room_nos"))).selectByIndex(2);
		WebElement c=d.findElement(By.name("datepick_in"));
		c.clear();
		c.sendKeys("20/2/2342");
		WebElement date=d.findElement(By.name("datepick_out"));
		date.clear();
		date.sendKeys("30/2/6458");
		new Select(d.findElement(By.name("adult_room"))).selectByValue("3");
		d.findElement(By.name("Submit")).click();
		d.findElement(By.name("radiobutton_1")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		d.findElement(By.name("check_all")).click();
		//d.findElement(By.linkText("Change Password")).click();
		//d.findElement(By.name("current_pass")).sendKeys("Raghu@1234567");
		//d.findElement(By.name("new_password")).sendKeys("Raghu@12345");
		//d.findElement(By.name("re_password")).sendKeys("Raghu@12345");
		//d.findElement(By.id("Submit")).click();
		d.findElement(By.id("logout")).click();
		d.findElement(By.linkText("Click here to login again")).click();
		d.close();
		d.quit();
		//}

	}

}
