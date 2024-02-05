package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class menycre {

	public static void main(String[] args) {
		String array[][]= {{"veerasubrahmanyam","Raghu@1234567"},{"Sivakollipaka","siva1234"},{"Thippesh","Thippesh"}};
		for(int i=0;i<array.length;i++) {
		// TODO Auto-generated method stub
			
		WebDriver d;
		try {
			d = new ChromeDriver();
	
		d.manage().window().maximize();
		d.get("https://adactinhotelapp.com/");
		d.findElement(By.name("username")).sendKeys(array[i][0]);
		d.findElement(By.id("password")).sendKeys(array[i][1]);
		d.findElement(By.className("login_button")).click();
		Thread.sleep(5000);
		 boolean x=d.findElement(By.name("location")).isDisplayed();
		 d.close();
		 System.out.println(x);
		 if(x) {
			 System.out.println("login is successfully");
			 
		 }else {
			 System.out.println("login is faild");
		 }
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
		
		
		

	}
	}

}
