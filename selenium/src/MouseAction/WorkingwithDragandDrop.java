package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithDragandDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dest=driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act=new Actions(driver);
	//	act.dragAndDrop(source, dest).perform();
	//ct.clickAndHold(source).release(dest).perform();
		act.moveToElement(source).clickAndHold().moveToElement(dest).clickAndHold().perform();

		
	}

}
