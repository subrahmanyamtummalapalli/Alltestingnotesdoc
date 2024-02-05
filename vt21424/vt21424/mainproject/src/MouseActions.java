import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
private static int VK_DOWN;

public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	Actions action=new Actions(driver);
	WebElement un=driver.findElement(By.id("username"));
	un.clear();
	un.sendKeys("veerasubrahmanyam");
	action.doubleClick(un).build().perform();
	action.contextClick().build().perform();
	Robot r=new Robot();
	for(int i=0;i<3;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	WebElement pwd=driver.findElement(By.id("password"));
	action.moveToElement(pwd);
	//pwd.sendKeys("Raghu@12345");
	action.contextClick(pwd).build().perform();
	for(int j=0;j<4;j++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.findElement(By.id("login")).click();
	
	
}
}
