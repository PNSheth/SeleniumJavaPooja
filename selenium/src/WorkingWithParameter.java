import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithParameter {
	@Test
	public void TestCase() {
		WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		   driver.manage().window().maximize();
		   driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("poojansheth@yahoo.com");
	  driver.findElement(By.id("Password")).sendKeys("Pooja123@");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
