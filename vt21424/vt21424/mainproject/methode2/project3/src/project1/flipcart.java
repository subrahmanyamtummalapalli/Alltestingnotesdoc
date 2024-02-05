package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158567!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=CjwKCAiAgbiQBhAHEiwAuQ6BkriJtf72Ck6PWnudUr4gYicG8BQAkCGhoBwW88FAHHdLpdpSqe_AmRoCPKgQAvD_BwE");
		//d.findElement(By.name("Login")).click();
//		d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("subbu9949393449@gmail.com");
//		d.findElement(By.xpath("_2IX_2- _3mctLh VJZDxU")).sendKeys("9949393449");
//		d.findElement(By.name("_2KpZ6l _2HKlqd _3AWRsL0")).click();
	}

}
