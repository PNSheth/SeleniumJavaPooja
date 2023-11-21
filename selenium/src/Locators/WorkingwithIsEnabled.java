package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithIsEnabled {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	boolean display=driver.findElement(By.partialLinkText("Books")).isDisplayed();
	if(display==true)
		
	System.out.println("Book is displayed"+display);
	driver.findElement(By.partialLinkText("Books")).click();
	
	
	

}
}