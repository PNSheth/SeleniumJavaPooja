package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='start']")).click();
		driver.findElement(By.xpath("//button[text()='One']")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button02")));
		driver.findElement(By.xpath("//button[text()='Two']")).click();
		//Thread.sleep(4000);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Three']")));
		driver.findElement(By.id("button03")).click();
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("buttonmessage")));
		 String text=driver.findElement(By.id("buttonmessage")).getText();
     	System.out.println(text);
		
		
		
	}
}
		
		
