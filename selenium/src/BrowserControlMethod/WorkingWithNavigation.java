package BrowserControlMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigation {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 System.out.println(driver.getTitle());
	 driver.get("https://www.ebay.co.uk/");
	 driver.getTitle();
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.navigate().forward();
	 Thread.sleep(3000);
	 driver.navigate().refresh();
	 driver.navigate().to("https://www.amazon.co.uk/");
	 Thread.sleep(3000);
	 driver.navigate().to("https://www.ebay.co.uk/");
	 driver.close();
	 
	 
	 //Code for quit method. Quit method close all tabs including parent one and close method only close parent tab
	 driver.get("file:///C:/Users/Yash-PC/Downloads/Multiple%20Windows.html");
	 driver.findElement(By.xpath("//button[text()='Open Windows']")).click();
	 Thread.sleep(4000);
	 driver.quit();
	 
	
	 

	}

}
