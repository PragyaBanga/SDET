package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
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

	@BeforeSuite
	public void first() 
	{
		System.out.println("Setting up the drivers");
	}

	@BeforeClass
	public void one()
		{	System.out.println("to get the url");}

	@BeforeMethod
	public void two()
		{	System.out.println("this is beforemethod to enter credentials ");}

	@BeforeTest
	public void three() 
		{System.out.println("this is bef0re test- to lauch browser");}

	@Test
	public void four() 
	{	System.out.println("this is the test");}

	@AfterMethod
	public void five()
		{System.out.println("I want to log out");}
	
	@AfterClass
	public void six() 
		{System.out.println("Close the driver");}
	
    @AfterTest
   public void seven() 
	{System.out.println("To delete given files");}
    
	@AfterSuite
	public void eight() 
	{	System.out.println("share results");}
}
