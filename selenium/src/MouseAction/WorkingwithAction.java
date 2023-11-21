package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.ebay.co.uk/");
			//WebElement Electronics=	driver.findElement(By.linkText("Electronics"));
			Actions act=new Actions(driver);
			WebElement desktop=driver.findElement(By.xpath("(//a[text()='Desktops & All-in-Ones'])[1]"));
			act.click(desktop).perform();
}

}
