package BrowserControlMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingToUrl {
	
	public static void main(String args[]) throws InterruptedException
	{
		//to Navigate to Browser
     WebDriver d=new ChromeDriver();
   // d.get("https://www.tkmaxx.com/uk/en/clearance/women/accessories/handbags+purses/c/05010401?st=&sort=price-asc&facets=stockLevelStatus:inStock&page=1");
	//To Navigate to URL
     d.get("https://online.qspiders.com/student");
     //To Maximize the Browser
     System.out.println(d.manage().window().getSize());
     d.manage().window().maximize();
     System.out.println(d.manage().window().getSize());
     //TO get the title of the Webpage
     String Title=d.getTitle();
     System.out.println(Title);
     d.manage().window().minimize();
     System.out.println(d.manage().window().getSize());
     //To get the current URL
    String CurrentUrl= d.getCurrentUrl();
    System.out.println(CurrentUrl);
    //To get the Page Source 
   String Source= d.getPageSource();
   System.out.println(Source);
   // to get the User or Handler
  String Handle= d.getWindowHandle();
  System.out.println(Handle);
  Thread.sleep(4000);
  d.close();
   
	
	}
	
}
