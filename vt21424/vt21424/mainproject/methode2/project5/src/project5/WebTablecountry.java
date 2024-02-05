package project5;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTablecountry {
public void country(String s) {
WebDriver driver = new ChromeDriver();
driver.get("https://cosmocode.io/automation-practice-webtable/");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
List<WebElement> row = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr"));
int rows = row.size();
for (int i = 1; i <= rows; i++) {
WebElement value = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[" + i + "]/td[2]"));
if (value.equals(s)) {
driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+i+"]/td[1]/input")).click();
}
}
}



public static void main(String[] args) {
WebTablecountry obj = new WebTablecountry();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the country name");
String s = sc.nextLine();
obj.country(s);



}



}