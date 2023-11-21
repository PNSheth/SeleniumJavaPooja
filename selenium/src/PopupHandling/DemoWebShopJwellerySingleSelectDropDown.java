package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopJwellerySingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		WebElement jwelleryselect=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select jselect=new Select(jwelleryselect);
		for(int i=0;i<6;i++)
		{
		 jselect.selectByIndex(i);
		 Thread.sleep(4000);
		 jwelleryselect=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 jselect=new Select(jwelleryselect);
		}
		
		//driver.findElement(By.xpath("(//span[text()='500.00'])[1]")).click();
		//driver.findElement(By.xpath("//a[text()='Remove Filter']")).click();

	}

}
