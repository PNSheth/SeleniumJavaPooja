package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalJobsLocationSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.totaljobs.com/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Accept All']")).click();
	     Thread.sleep(1000);
	WebElement City=driver.findElement(By.xpath("//input[@placeholder='Town, city or postcode']"));
	City.click();
	City.sendKeys("BN10 8UA");
	Thread.sleep(2000);
	
	WebElement SingleSelect=driver.findElement(By.xpath("//select[@name='Radius']"));
	Select s=new Select(SingleSelect);
	s.selectByIndex(4);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Address, postcode or town/city']")).sendKeys("Brighton");
	//driver.findElement(By.xpath("//div[@class='res-slider-base']")).click();
//	driver.findElement(By.xpath("//button[@class='hf-provider-qycx82']")).click();

	}

}
