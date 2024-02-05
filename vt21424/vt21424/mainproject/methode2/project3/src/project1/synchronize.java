package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
	WebDriverWait wait=new WebDriverWait(driver,10);
		//driver.findElement(By.linkText("Customer Service")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='CustomerService']"))).click();

	}

}
