package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		//ExpTitle is String data
		String ExpTitle="actiTIME - Login";
		//Launching a Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Getting a URL
		driver.get("https://demo.actitime.com/login.do");
		//Comparing Title with Expected Title
		if(driver.getTitle().equals(ExpTitle))
		{ 
	      System.out.println("Testcase Passed");
		}
	      else
	      System.out.println("TestCase Failed");
	    	
		
}