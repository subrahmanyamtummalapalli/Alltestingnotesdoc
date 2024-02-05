package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://adactinhotelapp.com/");
		d.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		d.findElement(By.id("password")).sendKeys("Raghu@12345");
		d.findElement(By.className("login_button")).click();
	//Thread.sleep(5000);
		Select loclistbox=new Select(d.findElement(By.name("location")));
		loclistbox.selectByVisibleText("London");
		new Select(d.findElement(By.name("room_nos"))).selectByIndex(2);
		WebElement checkindata=d.findElement(By.name("datepick_in"));
		WebElement checkoutdata=d.findElement(By.name("datepick_out"));
		checkindata.clear();
		checkindata.sendKeys("17/2/2020");
		checkoutdata.clear();
		checkoutdata.sendKeys("19/02/2022");
		Select adult=new Select(d.findElement(By.name("adult_room")));
		d.findElement(By.name("adult_room")).click();
		d.findElement(By.name("Submit")).click();
		d.findElement(By.name("radiobutton_1")).click();
		d.findElement(By.id("continue")).click();
		d.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("rao");
		d.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("tumma");
		d.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("kakinada");
		Select se=new Select (d.findElement(By.xpath("//*[@id=\"cc_type\"]")));
		se.selectByIndex(2);
		Select month=new Select (d.findElement(By.xpath("//*[@id=\"cc_exp_month\"]")));
		month.selectByVisibleText("May");
		Select year=new Select(d.findElement(By.xpath("//*[@id=\"cc_exp_year\"]")));
		year.selectByIndex(3);
		d.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("123");
		
		
		
		
		//adult.selectByValue("2");
//		WebElement surchbutton=d.findElement(By.name("Submit"));
//		Select location=new Select(surchbutton);
//		
//		
//		}
//		
//		d.findElement(By.name("radiobutton_1")).click();
//		//WebElement ddr = d.findElement(By.classname)
//		
//		d.findElement(By.linkText("Booked Itinerary")).click();
//		d.findElement(By.partialLinkText("Booked"));
//		d.navigate().back();
//		//d.close();
//		d.findElement(By.name("check_all")).click();
//		Thread.sleep(4000);
//		d.findElement(By.linkText("Logout")).click();
//		d.findElement(By.cssSelector("input[name=username]")).sendKeys("testtester");
		
		
		

		
		}
		

	}


