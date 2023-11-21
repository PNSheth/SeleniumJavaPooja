package workingWithTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithConfigurationAnnotation {
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Establish the Conection to the Server");
	}
	@BeforeTest
   public void beforeTest()
   {
	   System.out.println("Establish the Connection to the DataBase");
   }
	@BeforeClass
   public void beforeClass()
   {
	   System.out.println("Launch the Browser");
   }
	@BeforeMethod
   public void beforeMethod()
   {
	   System.out.println("Login Action Performed");
   }
	@Test
   public void TestCase1()
   {
	   System.out.println("TestCase 1 is executed");
   }
	@AfterMethod
   public void afterMethod()
   {
	   System.out.println("Log out");
   }
	@AfterClass
   public void afterClass()
   {
	   System.out.println("Close the Browser");
   }
	@AfterTest
   public void afterTest()
   {
	   System.out.println("Disconnect from the DataBase");
   }
	@AfterSuite
   public void afterSuite()
   {
	   System.out.println("Disconnect from Server");
	   
   }
}
