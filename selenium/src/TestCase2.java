import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		WebElement select= driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(select);
		s.selectByIndex(4);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(3000);
		WebElement ShoppingCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		ShoppingCart.click();
		Thread.sleep(3000);
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
			
	}

}
