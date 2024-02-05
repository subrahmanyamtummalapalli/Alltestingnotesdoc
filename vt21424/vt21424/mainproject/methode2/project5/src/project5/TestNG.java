package project5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeTest
	public void BT() {
	System.out.println("BeforeTest");
	}
	@AfterTest
	public void AT() {
	System.out.println("After Test");
	}
	@BeforeSuite
	public void BS() {
	System.out.println("Before Suite");
	}
	@AfterSuite
	public void AS() {
	System.out.println("After Suite");
	}
	@BeforeClass
	public void BC() {
	System.out.println("Before Class");
	}
	@AfterClass
	public void AC() {
		System.out.println("After class");
		}
	@BeforeMethod
	public void BM()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("Aftermethod");
	}
	@Test
	public void Test1()
	{
		System.out.println("test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	
}
