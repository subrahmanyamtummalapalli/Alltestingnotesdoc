package AndroidTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class AppiumTest {
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	public static UiAutomator2Options options;
	
	@Test
	public void mobileAppTest() throws MalformedURLException
	{
//		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\vc21352\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("0.0.0.0").usingPort(4723).build();
//		service.start();
		options = new UiAutomator2Options();
		options.setDeviceName("vinay");
		options.setApp("C://Users//vc21352//eclipse-workspace//AppiumTest//src//test//java//Resources//ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.quit();
		//service.stop();
	}

}
