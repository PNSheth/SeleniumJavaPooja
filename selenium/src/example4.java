import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  
	  

	}

}
