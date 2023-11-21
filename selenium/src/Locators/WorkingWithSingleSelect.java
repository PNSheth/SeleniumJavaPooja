package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Yash-PC/Downloads/demo.html");
		WebElement single=driver.findElement(By.id("standard_cars"));
		Select singledd=new Select(single);
		singledd.selectByIndex(1);
		Thread.sleep(4000);
		singledd.selectByValue("bmw");
		Thread.sleep(4000);
		singledd.selectByVisibleText("Ford");
		List<WebElement> alloptions=singledd.getOptions();
	/*or(WebElement options:alloptions)
		{
			System.out.println(options.getText());
		}*/
       
	   //using a findElements method fetch the name of webElements
		List<WebElement> multi=driver.findElements(By.xpath("//select[@id='standard_cars']//option"));
		for(WebElement single1:multi)
		{
			System.out.println(single1.getText());
		}
	}
}