package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSwitchToFrameByWebElement {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/USER/Desktop/frame.html");
		WebElement demoFrame = driver.findElement(By.xpath("//iframe[@src=\"file:///C:/Users/USER/Desktop/insideframe.html\"]"));
		driver.switchTo().frame(demoFrame);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	}

}
