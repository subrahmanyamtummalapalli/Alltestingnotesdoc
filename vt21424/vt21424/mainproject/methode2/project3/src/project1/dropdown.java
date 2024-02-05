package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		Actions obj = new Actions(d);
		obj.clickAndHold(d.findElement(By.id("draggable"))).moveToElement(d.findElement(By.id("droppable"))).release().build().perform();
		if(obj == d) {
			System.out.println("not droppable");
			
		}else {
			System.out.println(" droppable is successfull");
		}
		
		

	}

}
