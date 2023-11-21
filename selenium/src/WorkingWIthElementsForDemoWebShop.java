import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWIthElementsForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("poojasheth@yahoo.com");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pooja123@");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Books")).click();
        List<WebElement>productname=driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<WebElement> price=driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for(WebElement bookprice:price)
        {
        	System.out.println(bookprice.getText());
        }
        
	}

}
