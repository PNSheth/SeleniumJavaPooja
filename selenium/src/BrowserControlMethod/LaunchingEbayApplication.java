package BrowserControlMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEbayApplication {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.co.uk/");
	driver.manage().window().maximize();
	String EbayTitle=driver.getTitle();
	System.out.println(EbayTitle);
	
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	Thread.sleep(3000);
	driver.close();
	
	
	
}
}
