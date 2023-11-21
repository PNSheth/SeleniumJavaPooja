package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithAbsolute {

	public static void main(String[] args) {
   
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Yash-PC/Downloads/RegistrationPage.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Pooja");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("pooja@yahoo.com");
		driver.findElement(By.xpath("/html/body/input[5]")).click();
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		driver.findElement(By.xpath("/html/body/input[8]")).click();
		
	}

}
