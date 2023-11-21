package LaunchingBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingDemoWebShop {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Sheth");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("poojasheth@yahoo.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pooja123@");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Pooja123@");
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	    
		
	
		
	}
}
