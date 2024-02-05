package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicData {

	public static void main(String[] args) throws Throwable {
		
		 Faker faker = new Faker();
		 
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("New User Register Here")).click();
		for(int i=0;i<=10;i++) {
			 String randomName = faker.name().fullName();
	         String randomLastName = faker.name().lastName();
	         String randomEmail = faker.internet().emailAddress();

		driver.findElement(By.id("username")).sendKeys(randomLastName);
		driver.findElement(By.id("password")).sendKeys(randomLastName);
		driver.findElement(By.id("re_password")).sendKeys(randomLastName);
		driver.findElement(By.id("full_name")).sendKeys(randomName);
		driver.findElement(By.id("email_add")).sendKeys(randomEmail);
		
		WebElement capt = driver.findElement(By.id("captcha"));
		//System.out.println(capt.getText());
		driver.findElement(By.id("captcha-form")).sendKeys(capt.getText());
		Thread.sleep(3000);
		driver.findElement(By.id("Reset")).click();
		Thread.sleep(2000);
		}
	}

}
