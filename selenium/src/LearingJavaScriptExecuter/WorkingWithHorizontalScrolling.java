package LearingJavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHorizontalScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
				JavascriptExecutor js=(JavascriptExecutor) driver;
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(500,0);");
				Thread.sleep(4000);
				js.executeScript("window.scrollBy(-500,0);");
				
				
				
	}
}
