package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameAttribute {
	public static void main(String argd[])
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
WebElement userNameTF=	driver.findElement(By.id("username"));
userNameTF.sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
//driver.findElement(By.className("initial")).click();
driver.findElement(By.linkText("Forgot your password?")).click();

	}

}
