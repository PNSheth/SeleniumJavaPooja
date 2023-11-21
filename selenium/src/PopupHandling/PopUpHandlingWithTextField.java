package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandlingWithTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	     driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	     driver.switchTo().alert().sendKeys("Hello");
	     driver.switchTo().alert().accept();
	     
	    
	  
	  

	}

}
