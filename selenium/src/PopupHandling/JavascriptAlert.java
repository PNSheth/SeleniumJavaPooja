package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
     Thread.sleep(4000);
     Alert alt=driver.switchTo().alert();
    System.out.println( alt.getText());
     alt.accept();
    
	}

}
