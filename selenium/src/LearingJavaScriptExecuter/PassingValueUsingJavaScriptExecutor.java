package LearingJavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingValueUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.saucedemo.com/");
		WebElement UTextField=driver.findElement(By.id("user-name"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Pooja';",UTextField);
		WebElement Login=driver.findElement(By.id("login-button"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].click()",Login);
		
		
		
	}

}
