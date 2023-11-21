package BrowserControlMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDifferentNavitageMethods {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//second approach to navigate to URL
		URL url=new URL("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
	    //3rd approach to navigate to URL
		driver.navigate().to(url);
		driver.navigate().to("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
         
	}

}
