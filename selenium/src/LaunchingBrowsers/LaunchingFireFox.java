package LaunchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingFireFox {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver=new ChromeDriver();
		driver=new EdgeDriver();
		 driver=new InternetExplorerDriver();
	}

}
