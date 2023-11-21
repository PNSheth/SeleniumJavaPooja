package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingToEbay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String title="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.co.uk/");
		if(driver.getTitle().equals(title))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Wrong Title");
		}
		System.out.println(driver.getPageSource());
		driver.close();
		
		

	}

}
