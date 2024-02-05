package project5;

import java.util.List;
import java.util.Scanner;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class contary {
public void country(String s) {
WebDriver driver = new ChromeDriver();
driver.get("https://cosmocode.io/automation-practice-webtable/");
List<WebElement> row = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr"));
int rows = row.size();
for (int i = 1; i <= rows; i++) {
String value = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[" + i + "]/td[2]")).getText();
if (value.equalsIgnoreCase(s)) {
driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+i+"]/td[1]/input")).click();
}
}
}



public static void main(String[] args) {
contary obj = new contary();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the country name");
String s = sc.nextLine();
obj.country(s);



}



}
	
