package Synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_0']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("pooja123");
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pooja123");
	   
	
	

}
}