package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptchaAutomate {

	public static void main(String[] args) {
		
		 Faker faker = new Faker();

		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://mahindradna.com/DMS/login");
		driver.manage().window().maximize();
		

		String randomName = faker.name().fullName();
        String randomLastName = faker.name().lastName();
		WebElement a = driver.findElement(By.id("code"));
		driver.findElement(By.id("nameId")).sendKeys(randomName);
		driver.findElement(By.id("passwordId")).sendKeys(randomLastName);
		driver.findElement(By.id("txtcaptcha")).sendKeys(a.getText());
		
	}

}
