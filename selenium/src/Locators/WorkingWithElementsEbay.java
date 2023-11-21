package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithElementsEbay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.co.uk/");
		List<WebElement> ebayLinks=driver.findElements(By.xpath("//a"));
		for(WebElement link: ebayLinks)
		{
			System.out.println(link.getText());
		}
		
	}

}
