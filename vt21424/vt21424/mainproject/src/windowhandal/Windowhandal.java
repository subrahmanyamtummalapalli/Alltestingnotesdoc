package windowhandal;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandal {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	String winid=driver.getWindowHandle();
	System.out.println(winid);
	driver.switchTo().frame("CDwindow-49D545F499F169904661C35536F6F32C");
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	String parent= driver.getWindowHandle();
//	System.out.println(parent);
//	Thread.sleep(2000);
	driver.findElement(By.linkText("Help")).click();
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	Set<String> windowids= driver.getWindowHandles();
	driver.switchTo().frame(parent);
//	for(String k: windowids)
//	{
//		if(!k.equals(parent)) 
//		{
//			System.out.println(k);
//			driver.switchTo().window(k);
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
//			// driver.close();
//			}}
//	driver.switchTo().window(parent);
//	driver.findElement(By.name("email")).sendKeys("Iliyana");
//	// driver.quit();
//	driver.close();
	
		}
	}
	
	
	

