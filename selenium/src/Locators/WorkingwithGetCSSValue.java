package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetCSSValue {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("poo");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
	//WebElement errorMessage=driver.findElement(By.xpath("//span[contain(text(),'Username')]"));
		WebElement errorMessage=driver.findElement(By.xpath("//span[contains(text(),'Username')]"));
	String color=errorMessage.getCssValue("color");
		System.out.println("color:"+color);
		String font=errorMessage.getCssValue("font");
		System.out.println("font:"+font);
		
	}
}
