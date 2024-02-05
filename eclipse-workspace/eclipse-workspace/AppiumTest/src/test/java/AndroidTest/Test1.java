package AndroidTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test1 {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "emulator-5554");
		
		cap.setCapability("platformName", "Android");
		
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

		cap.setCapability(CapabilityType.VERSION, "11");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        driver.get("https://www.amazon.com");
		
	}
}
