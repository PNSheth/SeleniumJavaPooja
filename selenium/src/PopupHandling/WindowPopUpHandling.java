package PopupHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String DemoWebTitle=driver.getTitle();
		String DemoSessionId=driver.getWindowHandle();
        // driver.switchTo().window(DemoWebTitle)
	//	System.out.println(DemoWebTitle);
		//System.out.println(DemoSessionId);
		 driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	    driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	    driver.findElement(By.xpath("//a[text()='YouTube']")).click();  
	    driver.findElement(By.xpath("//a[text()='Google+']")).click();
	       Set<String>allId=driver.getWindowHandles();
	    String Title="NopCommerce | Facebook";
	     System.out.println(allId);
	       for(String id:allId)
	       {   driver.switchTo().window(id);
	       Thread.sleep(4000);
	    	   System.out.println(driver.getTitle());
	    	   if(!driver.getTitle().equals("NopCommerce | Facebook"))
	    	   driver.close();//to close individual tab
	    	  }   
	       for(String id:allId)
	       {
	    	   System.out.println(allId.iterator());
	       }
	    //driver.quit();to close all tabs
	       
		
      
		
		
		// TODO Auto-generated method stub

	}

}
