package TestScript;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomDropdown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("veerasubbu");
		driver.findElement(By.id("password")).sendKeys("veerasubbu");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
        Faker faker = new Faker();

		
		// Location
		Select loc = new Select(driver.findElement(By.id("location")));	
		List <WebElement> op = loc.getOptions();
		for(WebElement p : op)
		{
			System.out.println(p.getText());
		}
		Random randomLoc = new Random();
		int ranSize = randomLoc.nextInt(op.size());
		op.get(ranSize).click();
		
		// Hotel
		Select hotel = new Select(driver.findElement(By.id("hotels")));
		List <WebElement> op1 = hotel.getOptions();
		for (WebElement az : op1)
		{
			System.out.println(az.getText());
		}
		int ran1 = randomLoc.nextInt(op1.size());
		op1.get(ran1).click();
		
		// Room Type
		Select rm = new Select(driver.findElement(By.id("room_type")));
		List <WebElement> op2 = rm.getOptions();
		for (WebElement ai : op2)
		{
			System.out.println(ai.getText());
		}
		int ran2 = randomLoc.nextInt(op2.size());
		op2.get(ran2).click();
		
		// NO of Rooms
				Select roomno = new Select(driver.findElement(By.id("room_nos")));
				List <WebElement> op3 = roomno.getOptions();
				for (WebElement ao : op3)
				{
					System.out.println(ao.getText());
				}
				int ran3 = randomLoc.nextInt(op3.size());
				op3.get(ran3).click();
		
		// Check In Date
				String randomDate = faker.date().birthday().toString();
		        System.out.println("Random date: " + randomDate);
		        driver.findElement(By.id("datepick_in")).clear();
		        driver.findElement(By.id("datepick_in")).sendKeys(randomDate);

		
	}

}
