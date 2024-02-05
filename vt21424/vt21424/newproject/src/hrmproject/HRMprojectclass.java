package hrmproject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMprojectclass {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=adactin&rlz=1C1GCEU_enIN1014IN1014&oq=adactin&aqs=chrome..69i57.4210j0j4&sourceid=chrome&ie=UTF-8");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		List finalList = new ArrayList();
		for (WebElement element : elements){
		if(element.getAttribute("href") != null){
		finalList.add(element);
	
		//System.out.println(element);
		}}
		//return finalList;
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		

	}

}
