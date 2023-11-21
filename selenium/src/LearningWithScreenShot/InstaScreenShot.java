package LearningWithScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class InstaScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		WebElement login=driver.findElement(By.xpath("//div[text()='Log in']"));
	File src=login.getScreenshotAs(OutputType.FILE);
	File trc=new File("./ScreenShot/Login.png");
	FileHandler.copy(src, trc);
	
		
		
	
	}
}
