package LearningWithScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotWebElementTotalJobs {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.totaljobs.com/account/signin?ReturnUrl=/jobs/accountancy");
	    WebElement login=driver.findElement(By.id("Form_Email"));
	    
		File src=login.getScreenshotAs(OutputType.FILE);
		File trg=new File("./ScreenShot/Login.png");
		FileHandler.copy(src, trg);
		
		// TODO Auto-generated method stub

	}

}
