package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//for(int i=0;i<3;i++) {
		WebDriver d=new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys("veerasubrahmanyam");
		d.findElement(By.id("password")).sendKeys("Raghu@12345");
		d.findElement(By.className("login_button")).click();
		d.findElement(By.name("location")).sendKeys("Brisbane");
		d.findElement(By.id("hotels")).sendKeys("Hotel Hervey");
		WebElement checkindata=d.findElement(By.name("datepick_in"));
		WebElement checkoutdata=d.findElement(By.name("datepick_out"));
		checkindata.clear();
		checkindata.sendKeys("17/2/2020");
		checkoutdata.clear();
		checkoutdata.sendKeys("19/02/2022");
		d.findElement(By.name("Submit")).click();
		d.findElement(By.name("radiobutton_1")).click();
		d.findElement(By.id("continue")).click();	
		d.findElement(By.linkText("Booked Itinerary")).click();
		d.findElement(By.name("check_all")).click();
		d.findElement(By.className("reg_button")).click();
		d.findElement(By.className("check_all")).click();
		d.findElement(By.name("cancelall")).click();
		d.findElement(By.linkText("Logout")).click();
		//d.switchTo().alert().dismiss();
		d.switchTo().alert().accept();
		Thread.sleep(5000);		
		d.switchTo().alert().dismiss();
//		d.findElement(By.name("first_name")).sendKeys("subbu");
//		d.findElement(By.name("last_name")).sendKeys("tummalapalli");
//		d.findElement(By.className("txtarea")).sendKeys("kakinada");		
//		d.findElement(By.id("cc_num")).sendKeys("1122334455667788");
//		new Select(d.findElement(By.className("select_combobox"))).selectByVisibleText("VISA");
//		new Select(d.findElement(By.name("cc_exp_month"))).selectByIndex(2);
//		new Select(d.findElement(By.id("cc_exp_year"))).selectByValue("2018");
//		d.findElement(By.id("cc_cvv")).sendKeys("1234");
//		d.findElement(By.id("book_now")).click();
////		//d.close();
//		
		
		
		}

	}

//}
