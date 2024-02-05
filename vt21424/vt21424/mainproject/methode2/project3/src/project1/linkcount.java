package project1;

import java.awt.*;
import java.util.List;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/search?q=google&rlz=1C1CHBD_enIN984IN984&oq=google&aqs=chrome..69i57.10451j0j7&sourceid=chrome&ie=UTF-8");
		 List<WebElement> findElements = d.findElements(By.tagName("a"));
		 int size = findElements.size();
		 System.out.println(size);
		//for (WebElement webElement : findElements) {
		//	System.out.println(webElement.getText());
		}
		}
//	}

