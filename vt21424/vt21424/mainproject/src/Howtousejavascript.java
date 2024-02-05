import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtousejavascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,10023)");
		driver.findElement(By.xpath("//a[text()='2']")).click();
		Thread.sleep(2000);
		js.executeScript("");
		
		//window.scrollBy(0,250)
	}

}
