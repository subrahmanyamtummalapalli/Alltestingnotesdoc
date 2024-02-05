package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=1;i<=3;i++) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		driver.findElement(By.name("username")).clear();
		String u=driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(u);
		
//		driver.findElement(By.id("password")).sendKeys("Raghu@1234567");
//		driver.findElement(By.className("login_button")).click();
//		boolean x = driver.findElement(By.name("location")).isDisplayed();
//		//System.out.println(x);
//		if(x) {
//				System.out.println("Login is successfully ");
//			  }
//			else {
//			System.out.println("Login is Failed");
//			
		}
		}
//		String activalhometitle=driver.getTitle();
//		String exceptedhometitle="Adactin.com - Search Hotel" ;
		
//		if(activalhometitle.equals(exceptedhometitle))
//		{
//		System.out.println("Login is successfully ");
//		}
//		else {
//			System.out.println("Login is Failed");
//		}
		// Select loc=new Select(driver.findElement(By.name("location")));
		// loc.selectByVisibleText("london");
		//driver.close();
		//driver.quit();
		
		
		
				
	//}

//}
