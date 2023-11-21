package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/iframe");
      // driver.switchTo().frame(0);
       driver.switchTo().frame("mce_0_ifr");
       String message=driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
       System.out.println(message);
       // TO switch the driver Focus to parent frame
       driver.switchTo().defaultContent();
  //     driver.switchTo().parentFrame();
       driver.findElement(By.xpath("//span[text()='Edit']")).click();
       
       
       
       
       
	} 

}
