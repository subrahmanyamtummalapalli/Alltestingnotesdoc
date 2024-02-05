package FailedSCTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TestRun extends ReusableMethods {

	@Test
	public void test1()
	{
		launchBrowser();
		Assert.assertEquals(false, true);
	}
}
