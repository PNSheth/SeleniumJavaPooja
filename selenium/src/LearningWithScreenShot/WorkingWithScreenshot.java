package LearningWithScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenshot {
	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	TakesScreenshot s=(TakesScreenshot) driver;
	File src=s.getScreenshotAs(OutputType.FILE);
	File targt=new File("./ScreenShot/facebook.png");
	FileHandler.copy(src, targt);
	
	
	
	
	
   
	}
}
