package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupCancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	     driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	     Alert alt=driver.switchTo().alert();
	    System.out.println( alt.getText());
	    Thread.sleep(4000);
	     alt.dismiss();
	     WebElement cancel=driver.findElement(By.xpath("//p[text()='You clicked: Cancel']"));
	    System.out.println( cancel.getText());
	     
	     
	     

	}

}
