package PopupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebPage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.findElement(By.xpath("//a[text()='Ok']")).click();
		driver.switchTo().frame(0);
		 Robot r=new Robot();
		driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]")).click();
      
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> sessionId=driver.getWindowHandles();
		System.out.println(sessionId);
		for(String id:sessionId)
		{   driver.switchTo().window(id);
		    Thread.sleep(4000);
			System.out.println(driver.getTitle());
		}
	  
	
		
		
	}

}
