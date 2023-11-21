package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithfindelements2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
