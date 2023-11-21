package LearingJavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptScrolldownTotaljobs {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				driver.get("https://www.selenium.dev/");
				WebElement allrightreservedText=driver.findElement(By.xpath("//small[text()='© 2023 Software Freedom Conservancy All Rights Reserved']"));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				Thread.sleep(3000);
				js.executeScript("arguments[0].scrollIntoView[false];",allrightreservedText);
				Thread.sleep(3000);
				TakesScreenshot ts=(TakesScreenshot) driver;
			File src=	ts.getScreenshotAs(OutputType.FILE);
			File target=new File("./ScreenShot/Selenium.png");
			FileHandler.copy(src, target);
			
				
			
				
	}

}
