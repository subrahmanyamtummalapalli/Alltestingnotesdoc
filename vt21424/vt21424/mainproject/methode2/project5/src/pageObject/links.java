package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com/search?q=what+is+testing&rlz=1C1CHBD_enIN984IN984&oq=what+is+testing&aqs=chrome..69i57j0i512l9.8495j0j7&sourceid=chrome&ie=UTF-8");
	List<WebElement> a=d.findElements(By.tagName("a"));
	System.out.println(a.size());
	for(WebElement i:a) 
	{
		System.out.println(i.getText());
	}
	
	
}
}
