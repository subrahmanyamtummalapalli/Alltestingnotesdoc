package project5;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
//		String a=driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[1]/td[3]")).getSize();
		
		String a=driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[1]/td[3]")).getText();
	System.out.println(a);
		
//		String b=driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[1]/td[i]")).getText();
//		System.out.println(b);

}
}