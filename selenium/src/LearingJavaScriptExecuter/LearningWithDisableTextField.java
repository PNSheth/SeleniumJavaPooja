package LearingJavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWithDisableTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement disableTextField=driver.findElement(By.xpath("//input[@id='tb2']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView[false];",disableTextField);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='Pooja';",disableTextField);
		

	}

}
