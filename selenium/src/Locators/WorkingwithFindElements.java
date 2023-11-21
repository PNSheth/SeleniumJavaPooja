package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFindElements {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> allRadioButton=driver.findElements(By.xpath("//li[@class='answer']"));
	System.out.println(allRadioButton.size());
	for(WebElement radiobutton:allRadioButton)
	{
		 System.out.println(radiobutton.getText());
	}
		
	{
		
	}
	}
}
