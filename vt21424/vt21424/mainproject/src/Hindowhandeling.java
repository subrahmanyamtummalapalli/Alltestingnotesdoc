import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Hindowhandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		boolean IMG=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
				Assert.assertTrue(IMG);
				
				System.out.println(IMG);
	String title=	driver.getTitle();
	System.out.println(title);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	String parent=driver.getWindowHandle();
	System.out.println(parent);
		driver.findElement(By.cssSelector("a[href=\"/help\"]")).click();
		String child=driver.getWindowHandle();
		System.out.println(child);
		Set<String>window=driver.getWindowHandles();
		for(String i:window)
			

		{
			System.out.println(i);
			if(!i.equals(child))
			{
				driver.switchTo().window("CDwindow-52B022A0E8C85023E650ECDD1D37BAE0");
			}
		}
	}

}
