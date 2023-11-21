package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRelative {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	 checkbox.click();
	 if(checkbox.isSelected())
	 {
		 System.out.println("checkbox is selected");
	 }
	
	System.out.println("Program executed");
	driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("admin");
	}
	
  

}
