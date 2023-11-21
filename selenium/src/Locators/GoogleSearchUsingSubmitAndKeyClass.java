package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchUsingSubmitAndKeyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
    WebElement SearchText=  driver.findElement(By.className("gLFyf"));
    SearchText.sendKeys("java");
    SearchText.submit();
    SearchText.clear();
    SearchText.sendKeys("Java",Keys.SPACE,"Selenium",Keys.ENTER);
      
	}

}
