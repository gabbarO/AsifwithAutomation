package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ToTakescreenShotOfWebElemnet {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		 File source = driver.findElement(By.xpath("//img[@alt=\"Google\"]")).getScreenshotAs(OutputType.FILE);
		 File destination = new File("./screenshots/googleImage.png");
		 
		 Files.copy(source, destination);
		
		
		
	
	}

}
