package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingWithConfigureAnnotation1 {
	 WebDriver driver=new ChromeDriver();
	  @BeforeClass
	  public void LaunchBrowser()
	  {
		 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		  driver.get("https://demowebshop.tricentis.com/");
	  }
	  @BeforeMethod
	  public void performLogin() throws InterruptedException
	  {
		  driver.findElement(By.partialLinkText("Log in")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("Email")).sendKeys("poojansheth@yahoo.com");
		  Thread.sleep(3000);
		  driver.findElement(By.id("Password")).sendKeys("Pooja123@");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  }
	  @Test
	  public void TestCase1()
	  {
		  System.out.println("TestCase1 executed");
	  }
	  @Test
	  public void TestCase2()
	  {
		  System.out.println("TestCase2 executed");
	  }
	 @AfterMethod
     public void performLogOut() throws InterruptedException
     {
    	 driver.findElement(By.partialLinkText("Log out")).click();
    	 Thread.sleep(3000);
     }
	 @AfterClass
	 public void closeBrowser()
	 {
		 driver.close();
	 }
}
