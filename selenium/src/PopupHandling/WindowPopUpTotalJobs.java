package PopupHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpTotalJobs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.totaljobs.com/");
		String Title=driver.getTitle();
		String sessionId=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@title='facebook']")).click();
		driver.findElement(By.xpath("//a[@title='twitter']")).click();
		driver.findElement(By.xpath("//a[@title='youtube.com']")).click();
		Set<String> allId=driver.getWindowHandles();
		for(String id:allId)
		{
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			if(!driver.getTitle().equals("Totaljobs | London  | Facebook"))
			{   Thread.sleep(4000);
				driver.close();
			}
				
		}
		

	}

}
