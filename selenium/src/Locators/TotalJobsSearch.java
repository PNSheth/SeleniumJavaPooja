package Locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalJobsSearch {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.totaljobs.com/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Accept All']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Jobs by sector']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Accountancy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/job/bookkeeper/aether-financial-job101445680']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Show my commute time']")).click();
	    Thread.sleep(1000);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Go']")).click();
		driver.findElement(By.xpath("(//span[text()='Apply'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("poojansheth@yahoo.com");
        driver.findElement(By.xpath("//button[text()='Continue with email']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='loginPasswordField']")).sendKeys("Only4you");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()='Replace CV']")).click();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyPress(KeyEvent.VK_ENTER);
     System.out.println(driver.findElement(By.xpath("//span[@class='meta-data-text ng-binding']")).getText());
        
	}
	
	
}