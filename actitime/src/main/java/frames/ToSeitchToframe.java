package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSeitchToframe {

	public static void main(String[] args) {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("C:/Users/USER/Desktop/frame.html");
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		
	}

}
