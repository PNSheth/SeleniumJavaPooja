package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.partialLinkText("Apparel & Shoes\r\n"
		//		+ "        ")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		String price=driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']/../..//span")).getText();
	   if( price.equals("11.00"))
	   {
		   System.out.println("Testcase Passed");
	   }
	   else
		   System.out.println("Testcase is failed");
	   System.out.println(price);
	   
	   Thread.sleep(5000);
	   
	   driver.navigate().back();
	   Thread.sleep(5000);
	   
	   driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	   price=driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//span")).getText();
	   System.out.println(price);
	   
	   
	   
	}
	

}
