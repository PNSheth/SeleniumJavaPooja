import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingAmazon {
	public static void main(String args[])
	{
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.co.uk/");
	d.manage().window().maximize();
	String Url=d.getCurrentUrl();
	}
}