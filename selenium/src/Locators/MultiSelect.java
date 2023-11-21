package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Yash-PC/Downloads/demo.html");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='multiple_cars']"));
	Select multiple=new Select(dropdown);
	multiple.selectByIndex(1);
	Thread.sleep(2000);
	multiple.selectByIndex(2);
	multiple.selectByValue("for");
	Thread.sleep(4000);
	List<WebElement> getoptions=multiple.getOptions();
	for(WebElement option:getoptions)
	{
		System.out.println(option.getText());
		option.click();
		
		
	}
	
	
	if(multiple.isMultiple())
		System.out.println("MultiSelect Dropdown");
		


}
